package Lambdas;

public class LambdasDemo {
    public LambdasDemo(String message) {
    }

    public void print(String message){

    }
    public static void show(){
//        Printer printer = System.out::println;
//        greet(System.out::println);
//        greet(message -> print(message));
//        greet(LambdasDemo::print);
//        var demo = new LambdasDemo();
//        greet(message -> demo.print(message));
//        greet(demo::print);
        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new);
    }
    public static void greet(Printer printer){
        printer.print("Good Morning");
    }
}
