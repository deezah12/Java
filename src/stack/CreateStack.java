package stack;

import java.util.Stack;

public class CreateStack {
    public static void main(String[] args) {
        Stack <String> cars = new Stack<>();

        // method push(add).
        cars.push("Toyota");
        cars.push("Honda");
        cars.push("Benz");
        cars.push("mazda");
        System.out.println("Stack: " + cars);

        // method pop(LIFO).
//        String item = cars.pop();
//        System.out.println("Remove item " + item);

        // method peek().
        String item1 = cars.peek();
        System.out.println("The item at the top is " + item1);

        //method search(returns item position from the top).
        int position = cars.search("Honda");
        System.out.println("the position of Honda is " + position);

        //method empty().
        boolean result = cars.empty();
        System.out.println("Is the stack empty? \t" + result);

    }
}
