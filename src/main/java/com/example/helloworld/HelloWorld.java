package com.example.helloworld;
import java.io.PrintStream;

public class HelloWorld {
    public static void main(String[] args){
        print(System.out);
    }

    public static void print(PrintStream out){
        out.println("Hello");
    }
}
