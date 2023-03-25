package Lambdas;

public class LambdasDemo {
    public static void show(){
        Printer printer = message-> System.out.println(message);
        greet(printer);
    }
    public static void greet(Printer printer){
        printer.print("Good Morning");
    }
}
