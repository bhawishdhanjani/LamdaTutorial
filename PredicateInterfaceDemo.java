package Lambdas;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    public static void show(){
//        Predicate<String> isLongerThan5 = str -> str.length() > 5;
//        boolean result = isLongerThan5.test("Hello World");
        Predicate<String> isStartWithBrace = str -> str.startsWith("{");
        Predicate<String> isEndWithBrace = str -> str.endsWith("}");
        Predicate<String> isStartAndEndWithBrace = isStartWithBrace.and(isEndWithBrace);
        System.out.println(isStartAndEndWithBrace.test("{Bhawish}"));
    }
}
