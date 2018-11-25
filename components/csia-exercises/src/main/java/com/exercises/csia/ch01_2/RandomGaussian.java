package com.exercises.csia.ch01_2;

public class RandomGaussian {

    public static void main(String[] args){
        double gaussianU = Math.random();
        double gaussianV = Math.random();

        double r = Math.sin(2*Math.PI*gaussianU)*Math.pow((-2*Math.log(gaussianV)),0.5);
        System.out.println("RandomGaussian Value is "+r);
    }
}
