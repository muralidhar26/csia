package com.exercises.csia.ch01_2;

public class ThreeSort {

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int x = Math.min(Math.min(a,b),c);
        int y = Math.max(Math.max(a,b),c);
        int z = a+b+c-x-y;

        System.out.println("Numbers in ascending order: "+x+" "+z+" "+y);
    }
}
