package com.example.android.boardcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int playerAmount = 4;
    LinearLayout background[] = new LinearLayout [playerAmount];
    TextView playerName[] = new TextView [playerAmount];
    TextView scoreTextView[] = new TextView [playerAmount];
    Button sit[] = new Button [playerAmount];
    Button stand[] = new Button [playerAmount];
    Button minus5[] = new Button [playerAmount];
    Button minus1[] = new Button [playerAmount];
    Button plus1[] = new Button [playerAmount];
    Button plus5[] = new Button [playerAmount];
    Button reset[] = new Button [playerAmount];

    PlayerCell player[] = new PlayerCell [playerAmount];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListView();

        //initializing all view variables
        //for PLAYER 1
//        background[0] = (LinearLayout) findViewById(R.id.player1_background);
//        playerName[0] = (TextView) findViewById(R.id.player1_name);
//        scoreTextView[0] = (TextView) findViewById(R.id.player1_score);
//        sit[0] = (Button) findViewById(R.id.player1_sit);
//        stand[0] = (Button) findViewById(R.id.player1_stand);
//        minus5[0] = (Button) findViewById(R.id.player1_minus5);
//        minus1[0] = (Button) findViewById(R.id.player1_minus1);
//        plus1[0] = (Button) findViewById(R.id.player1_plus1);
//        plus5[0] = (Button) findViewById(R.id.player1_plus5);
//        reset[0] = (Button) findViewById(R.id.player1_reset);
//
//        //for PLAYER 2
//        background[1] = (LinearLayout) findViewById(R.id.player2_background);
//        playerName[1] = (TextView) findViewById(R.id.player2_name);
//        scoreTextView[1] = (TextView) findViewById(R.id.player2_score);
//        sit[1] = (Button) findViewById(R.id.player2_sit);
//        stand[1] = (Button) findViewById(R.id.player2_stand);
//        minus5[1] = (Button) findViewById(R.id.player2_minus5);
//        minus1[1] = (Button) findViewById(R.id.player2_minus1);
//        plus1[1] = (Button) findViewById(R.id.player2_plus1);
//        plus5[1] = (Button) findViewById(R.id.player2_plus5);
//        reset[1] = (Button) findViewById(R.id.player2_reset);
//
//        //for PLAYER 3
//        background[2] = (LinearLayout) findViewById(R.id.player3_background);
//        playerName[2] = (TextView) findViewById(R.id.player3_name);
//        scoreTextView[2] = (TextView) findViewById(R.id.player3_score);
//        sit[2] = (Button) findViewById(R.id.player3_sit);
//        stand[2] = (Button) findViewById(R.id.player3_stand);
//        minus5[2] = (Button) findViewById(R.id.player3_minus5);
//        minus1[2] = (Button) findViewById(R.id.player3_minus1);
//        plus1[2] = (Button) findViewById(R.id.player3_plus1);
//        plus5[2] = (Button) findViewById(R.id.player3_plus5);
//        reset[2] = (Button) findViewById(R.id.player3_reset);
//
//        //for PLAYER 4
//        background[3] = (LinearLayout) findViewById(R.id.player4_background);
//        playerName[3] = (TextView) findViewById(R.id.player4_name);
//        scoreTextView[3] = (TextView) findViewById(R.id.player4_score);
//        sit[3] = (Button) findViewById(R.id.player4_sit);
//        stand[3] = (Button) findViewById(R.id.player4_stand);
//        minus5[3] = (Button) findViewById(R.id.player4_minus5);
//        minus1[3] = (Button) findViewById(R.id.player4_minus1);
//        plus1[3] = (Button) findViewById(R.id.player4_plus1);
//        plus5[3] = (Button) findViewById(R.id.player4_plus5);
//        reset[3] = (Button) findViewById(R.id.player4_reset);
//
//        for (int i = 0 ; i < playerAmount; i++)
//            player[i] = new PlayerCell(
//                    background[i],
//                    playerName[i],
//                    scoreTextView[i],
//                    sit[i],
//                    stand[i],
//                    minus5[i],
//                    minus1[i],
//                    plus1[i],
//                    plus5[i],
//                    reset[i]);
//        //set background colors for all fields
//        player[0].setBackgroundColor("#ff4444");
//        player[1].setBackgroundColor("#ffbb33");
//        player[2].setBackgroundColor("#33b5e5");
//        player[3].setBackgroundColor("#99cc00");
    }

    private void populateListView() {
        //Create list of items
        String[] myItems = {"blue","green","purple","red"};

        //Build adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,                       // context for the activity
                R.layout.player_list_item,  // Layout to use
                myItems);                   // Items to be displayed

        //configure list view
        ListView list = (ListView) findViewById(R.id.list_view_main);
        list.setAdapter(adapter);
    }

}
