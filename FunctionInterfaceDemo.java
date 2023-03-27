package Lambdas;

import java.util.function.Function;

public class FunctionInterface {
    public static void show(){
        Function<String,Integer> map = str -> str.length();
        int length = map.apply("Hello i am Bhawish.");
        System.out.println(length);

    }
}
