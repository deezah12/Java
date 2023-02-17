package chapter17;

import java.util.List;
import java.util.function.*;

public class FunctionTest {

    public static void main(String[] args) {

        //Consumer
        Consumer<Integer> consumer = (i) -> System.out.println(i * 2);
        //consumer.accept(20);


        List<Integer> numbers = List.of(1,2,3,4,5,6);
        //numbers.forEach(System.out::println);
        //numbers.forEach((x) -> System.out.println(x));
       // numbers.forEach(consumer);

        //BiConsumer
        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.printf("my name is %s and im %d years old%n", name, age);
       // biConsumer.accept("hadiza", 23);

        //Supplier
        Supplier<String> supplier = ()-> "I love Java";
        //System.out.println(supplier.get().toUpperCase());


        //predicate
        Predicate<Integer> predicate = (x) -> x % 2 == 0;
        //System.out.println(predicate.test(7));

        Predicate<String> predicate1= words -> words.length() == 4;
        //System.out.println(predicate1.test("word"));

//        BiPredicate<Integer, Integer> predicate2 = (x,y) -> x % y == 0;
//        System.out.println(predicate2.test(2,2));
//        BiPredicate<String, Integer> predicate3 = (x,y) -> x.length() == y;
//        System.out.println(predicate3.test("hell", 4));

        //function
        Function<String, Integer> function = (y) -> y.length() * 2;
        //System.out.println(function.apply("w"));

        BiFunction<String, String, String> biFunction = (x,y) -> x + y;
        //System.out.println(biFunction.apply("my ", "name"));
        String set = biFunction.apply("my " , "name");
        //System.out.println(set);

        //unary operator
        UnaryOperator<Integer> unaryOperator = (number) -> number * number;
        System.out.println(unaryOperator.apply(10));

        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;
        System.out.println(binaryOperator.apply(5, 6));


    }
}
