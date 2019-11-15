package com.example.listviewexample;

public class Player {
    //Todo finish the class player
        // Todo 5 member variables
        //Todo name, age, worth(money), main sport and int image resource from drawable
        //Todo create constructor and getters and setters
        // use Android Studio for fast writing code, find Code->Generate
    private String name;
    private int age;
    private double worth;
    private String mainSport;
    private int imageResource;
    public Player(String n,int a,double w,String m,int i)
    {
        name=n;
        age=a;
        worth=w;
        mainSport=m;
        imageResource=i;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getWorth()
    {
        return worth;
    }
    public String getMainSport()
    {
        return mainSport;
    }
    public int getImageResource()
    {
        return imageResource;
    }
    public void setName(String na)
    {
        name=na;
    }
    public void setAge(int ag)
    {
        age=ag;
    }
    public void setWorth(double wth)
    {
        worth=wth;
    }
    public void setMainSport(String main)
    {
        mainSport=main;
    }
    public void setImageResource(int image)
    {
        imageResource=image;
    }




}
