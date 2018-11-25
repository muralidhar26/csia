package com.exercises.csia.ch01_2;

public class OrderCheck {
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean value = ((x<y) && (y<z)) || ((x>y) && (y>z));

        System.out.println("The given number are in either in ascending or descending order: "+value);

    }
}
