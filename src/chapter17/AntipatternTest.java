package chapter17;

import java.util.Optional;

public class AntipatternTest {

    private static String[] names = {"jenny", "kelechi", "ilasa", "Temi"};
    public  static Optional<String> findName (String name){
        for (String n : names) {
            if (n.equalsIgnoreCase(name)) return  Optional.of(n);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
       Optional<String> foundName =findName("temi");
        //if (foundName.isEmpty()) System.out.println("name not found");
       // if (foundName.isPresent()) System.out.println(foundName.get());
        String name = foundName.orElseThrow(()-> new RuntimeException("oops!!"));
        System.out.println(name);
    }
}
