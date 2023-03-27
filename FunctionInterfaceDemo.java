package Lambdas;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void show(){
        Function<String,Integer> map = str -> str.length();
        int length = map.apply("Hello i am Bhawish.");
        System.out.println(length);
        Function<String,String> replaceColon = str -> str.replace(":","=");
        Function<String,String> addBrace = str -> "{"+str+"}";
        var result= replaceColon.andThen(addBrace).apply("20CS065:BhawishKumar");
        System.out.println(result);

    }
}
