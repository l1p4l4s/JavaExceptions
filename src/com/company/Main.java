package com.company;

public class Main {

    static void avg(){
        try{
            throw new ArithmeticException("Demo");
        }
        catch (ArithmeticException e){
            System.out.println("Exception cought");
            //comment
        }
    }

    public static void main(String[] args) {
        avg();
    }
}
