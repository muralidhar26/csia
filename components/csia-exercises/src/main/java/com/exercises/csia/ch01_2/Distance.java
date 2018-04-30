package com.exercises.csia.ch01_2;

public class Distance {

    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double euclideanDistance = Math.sqrt(x*x + y*y);

        System.out.println("The distance between "+x+" and "+y+" is "+euclideanDistance);

    }
}
