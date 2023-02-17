package codewars;

public class Hello {
    public  static String sayHello(String [] name, String city, String state){

      //String hello = String.valueOf(System.out.printf("%nHello, %s! Welcome to %s, %s!", Arrays.toString(name),city,state));

        String hello = "";
        for (String x: name) {
            hello += x;
        }
        return "Hello " +  hello + "!" + "Welcome to " + city + "," + state + "!";
    }

    public static void main(String[] args) {
        System.out.println(sayHello(new String[] {"Hadiza umar"}, "ikeja", "Lagos"));
    }

}
