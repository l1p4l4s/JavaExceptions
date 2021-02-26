package com.company;

public class Main {

    static void avg() throws ArithmeticException{
        System.out.println("inside avg function");
        throw new ArithmeticException("Demo");
    }

    public static void main(String[] args)
    {
        try {
            avg();
        }
        finally {
            System.out.println("Cough an exception!");
        }
    }
}
