package com.exercises.csia.ch01_2;

public class Ex_1_2_18 {

    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt((x*x)+(y*y));

        System.out.println("The distance between numbers "+ x +" and "+y+ " is "+ distance );

    }
}
