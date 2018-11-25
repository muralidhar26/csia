package com.exercises.csia.ch01_2;

public class Ex_1_2_23 {

    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean value = false;

        if(m==3){
            value = ((d>=20) && (d<=31));
        }else if(m==6){
            value = ((d<=20) && (d>=1));
        }else if(m==4){
            value = ((d>=1) && (d<=30));
        }else if(m==5){
            value = ((d>=1) && (d<=31));
        }

        System.out.println("Value is "+value);


    }
}
