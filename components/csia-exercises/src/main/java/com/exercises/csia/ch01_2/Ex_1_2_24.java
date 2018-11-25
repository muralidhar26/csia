package com.exercises.csia.ch01_2;

public class Ex_1_2_24 {

    public static void main(String[] args){
        double prinicipalAmount = Double.parseDouble(args[0]);
        double intersetRate = Double.parseDouble(args[1]);
        int numberOfYears = Integer.parseInt(args[2]);
        //cpounded interest as per formula P*Exp(R*n)
        double compoundedInterest = prinicipalAmount * Math.exp(intersetRate/100 * numberOfYears);

        System.out.println("Compounded Interest is "+compoundedInterest);
    }
}
