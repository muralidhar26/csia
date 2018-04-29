package com.exercises.csia.ch01_1;

public class HelloWorldRepeat {

    public static void main(String[] args){
        int numbetOfTimes = Integer.parseInt(args[0]);

        for (int i = 0; i < numbetOfTimes; i++){
            System.out.println("Hello, Murali");
        }
    }
}
