package Lambdas;

public class LambdasDemo {
    public static void show(){
        greet((message)-> System.out.println(message));
    }
    public static void greet(Printer printer){
        printer.print("Good Morning");
    }
}
