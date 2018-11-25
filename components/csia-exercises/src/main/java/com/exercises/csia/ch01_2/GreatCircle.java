package com.exercises.csia.ch01_2;

public class GreatCircle {

    public static void main(String[] args){
         double x1 = Math.toRadians(Double.parseDouble(args[0]));
         double y1 = Math.toRadians(Double.parseDouble(args[1]));
         double x2 = Math.toRadians(Double.parseDouble(args[2]));
         double y2 = Math.toRadians(Double.parseDouble(args[3]));

         double distance = 60*Math.acos(Math.sin(x1)*Math.sin(x2) +
                 Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));

         System.out.println("The Great Circle Distance between Paris and SF "+distance);
    }
}
