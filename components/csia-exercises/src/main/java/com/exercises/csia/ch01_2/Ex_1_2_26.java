package com.exercises.csia.ch01_2;

public class Ex_1_2_26 {
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
         double r = Math.sqrt(x*x + y*y);
         double theta = Math.atan2(y,x);

         System.out.println("Polar coordinates are "+ r +" and "+theta);
    }
}
