package Lambdas;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
    public static void show(){
        List<Integer> list = List.of(1,2,3);
        list.forEach(item-> System.out.println(item));
        List<String> listOfEmployee = List.of("a","b","c");
        Consumer<String> printEmployeeName = item -> System.out.println(item);
        Consumer<String> printEmployeeNameInUpperCase = item -> System.out.println(item.toUpperCase());
        listOfEmployee.forEach(printEmployeeName.andThen(printEmployeeNameInUpperCase));

    }
}
