package com.example.android.boardcounter;

/**
 * Created by umat on 17.03.17.
 */

public class Player {
    private int id;
    private String name;
    private int points;
    boolean isActve;

    public Player(int id, String name){
        setId(id);
        setName(name);
        setPoints(0);
        setActive(false);
    }
    public Player(int id){
        this(id, "Player");
    }

    public Player(){
        this(0);
    }


//GETTERS AND SETTERS
    //GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public boolean isActive() {
        return isActve;
    }

    //SETTERS
     public void setName(String name){
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setScore(int points) {
        setPoints(points);
    }

    public void setActive(boolean actve) {
        isActve = actve;
    }
}
