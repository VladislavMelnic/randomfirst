package com.somecompanyy.randomik;

public class Random {
    public  int randomnumber;
    public void  random (int firstnumber,int secondnumber){

        randomnumber = firstnumber + (int) (Math.random() * secondnumber);
    }
    public int getrandomnumber(){
        return randomnumber;
    }
}
