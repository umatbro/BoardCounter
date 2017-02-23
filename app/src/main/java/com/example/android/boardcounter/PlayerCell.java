package com.example.android.boardcounter;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by umat on 20.02.17.
 */

class PlayerCell {
    private int score;
    private LinearLayout background;
    private TextView playerName;
    private TextView scoreTextView;
    private Button buttonSit;
    private Button buttonStand;
    private Button buttonMinus5;
    private Button buttonMinus1;
    private Button buttonPlus1;
    private Button buttonPlus5;
    private Button resetButton;
    private int backgroundColor;    // color of the layout background

    PlayerCell(LinearLayout background, TextView playerName, TextView scoreTextView, Button buttonSit, Button buttonStand, Button minus5, Button minus1, Button plus1, Button plus5, Button reset){
        this.score = 0;
        this.background = background;
        this.playerName = playerName;
        this.scoreTextView = scoreTextView;
        this.buttonSit = buttonSit;
        this.buttonStand = buttonStand;
        this.buttonMinus5 = minus5;
        this.buttonMinus1 = minus1;
        this.buttonPlus1 = plus1;
        this.buttonPlus5 = plus5;
        this.resetButton = reset;
        this.backgroundColor = Color.parseColor("#000000");
        this.playerName.setTextColor(Color.parseColor("#ffffff"));

        //init onClickListeners
        this.buttonSit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activatePlayer();
            }
        });
        this.buttonStand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deactivatePlayer();
            }
        });
        this.buttonMinus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removePoints(5);
            }
        });
        this.buttonMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removePoints(1);
            }
        });
        this.buttonPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPoints(1);
            }
        });
        this.buttonPlus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPoints(5);
            }
        });
        this.resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                resetButton.setVisibility(View.INVISIBLE);
            }
        });

        //upon creating player, he or she should be set as inactive
        deactivatePlayer();
    }

    private void displayScore(int number){
        this.scoreTextView.setText(String.valueOf(number));
    }
    private void setScore(int number){
        this.score = (number >= 0) ? number : 0; // we don't want score to be less than 0
        displayScore(this.score);
    }
    private void addPoints(int points){
        setScore(this.score+points);
    }
    private void removePoints(int points) {
        setScore(this.score - points);
    }
    private void setActive(boolean setting) {
        if (!setting) {
            scoreTextView.setVisibility(View.INVISIBLE);
            buttonSit.setVisibility(View.VISIBLE);
            buttonStand.setVisibility(View.GONE);
            buttonMinus5.setVisibility(View.INVISIBLE);
            buttonMinus1.setVisibility(View.INVISIBLE);
            buttonPlus1.setVisibility(View.INVISIBLE);
            buttonPlus5.setVisibility(View.INVISIBLE);
            if(score != 0) resetButton.setVisibility(View.VISIBLE);
            background.setBackgroundColor(Color.GRAY);
            scoreTextView.setTextColor(Color.parseColor("#ffffff"));
        } else {
            scoreTextView.setVisibility(View.VISIBLE);
            buttonSit.setVisibility(View.GONE);
            buttonStand.setVisibility(View.VISIBLE);
            buttonMinus5.setVisibility(View.VISIBLE);
            buttonMinus1.setVisibility(View.VISIBLE);
            buttonPlus1.setVisibility(View.VISIBLE);
            buttonPlus5.setVisibility(View.VISIBLE);
            resetButton.setVisibility(View.GONE);
            displayScore(this.score);
            background.setBackgroundColor(backgroundColor);
        }
    }
    private void activatePlayer(){
        setActive(true);
    }
    private void deactivatePlayer(){
        setActive(false);
    }
    void setBackgroundColor(String colorString){
        this.backgroundColor = Color.parseColor(colorString);
    }
}
