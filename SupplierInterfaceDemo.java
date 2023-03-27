package Lambdas;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void show(){
        Supplier<Double> getRandomNo = ()-> Math.random();
        var random = getRandomNo.get();
        System.out.println(random);

    }
}
