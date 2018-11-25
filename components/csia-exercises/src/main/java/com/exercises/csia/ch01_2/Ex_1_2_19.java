package com.exercises.csia.ch01_2;

public class Ex_1_2_19 {

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int value = (int)(Math.random() * (b-a)) + a;
        System.out.println("Value is "+value);

    }
}
