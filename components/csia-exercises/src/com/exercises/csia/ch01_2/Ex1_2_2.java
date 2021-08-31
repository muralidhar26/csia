package com.exercises.csia.ch01_2;

public class Ex1_2_2 {

    public static void main(String[] args){
        double theta = Double.parseDouble(args[0]);
        double value = (Math.sin(theta) * Math.sin(theta)) +
                (Math.cos(theta) * Math.cos(theta));

        System.out.println("Value is "+ value);
    }
}
