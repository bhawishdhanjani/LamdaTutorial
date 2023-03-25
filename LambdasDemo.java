package Lambdas;

public class LambdasDemo {
    public static void show(){
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }
    public static void greet(Printer printer){
        printer.print("Good Morning");
    }
}
