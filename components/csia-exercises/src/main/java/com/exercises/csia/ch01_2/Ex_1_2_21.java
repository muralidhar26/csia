package com.exercises.csia.ch01_2;

public class Ex_1_2_21 {

    public static void main(String[] args){
         double theta = Math.toRadians(Double.parseDouble(args[0]));

         double value = Math.sin(2*theta) + Math.sin(3*theta);
         System.out.println("Value is "+value);

    }
}
