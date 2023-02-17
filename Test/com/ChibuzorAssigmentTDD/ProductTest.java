package com.ChibuzorAssigmentTDD;
import com.Chibuzor.Assigment.Product;

import java.text.SimpleDateFormat;
        import java.util.*;

public class ProductTest {
    public static void main(String[] args) {

        //Product shop = new Product("hgx", 2,300,600);

        Product shop = new Product();
        String productName;
        int quantity;
        double price;
        double totalPrice;
        double overAllPrice = 0.00;
        double subtotal;
        double discount;
        double vatAmount;
        char choice;





        Scanner input = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customerName = input.nextLine();
        shop.setCustomerName(customerName);


        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        String[] days = new String[]{"Sunday","Monday", "Tuesday","Wednesday","Thursday", "Friday", "Saturday"};

        //create an arraylist to store product

        List<Product>products =new ArrayList<>();



        do {
            System.out.println("Enter Product Details: ");
            System.out.print("product name: ");
            productName = input.nextLine();

            System.out.print("Quantity: ");
            quantity = input.nextInt();

            System.out.print("Price: ");
            price = input.nextDouble();

            totalPrice = price *quantity;
            overAllPrice = overAllPrice + totalPrice;

            products.add(new Product(productName, quantity, price, totalPrice));
            System.out.print("Want to add more items?(Y or N): ");
            choice = input.next().charAt(0);
            input.nextLine();
        }
        while (choice =='Y' || choice == 'y');



        System.out.println("==================================================================");
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 0987322455");

        System.out.println("Date: " + formatter.format(date)+" "+days[calendar.get(Calendar.DAY_OF_WEEK)-1]);

        Product.displayFormat();

        for(Product p : products){
            p.display();
        }

        System.out.println("========================================================================");
        System.out.println(" ");
        System.out.println("Total Amount(NGN):  " + overAllPrice);

        discount = overAllPrice * 0.02;
        System.out.println("Discount(NGN):      " + discount);

        subtotal = overAllPrice - discount;
        System.out.println("Subtotal:           " + subtotal);

        vatAmount = overAllPrice * 0.07;
        System.out.println("vatAmount (%):      " + vatAmount);

        System.out.println("Invoice Total:      " + (subtotal + vatAmount));
        System.out.println("====================================Thank you for shopping!!==============================");
        System.out.println("\t\t\t\t                                                  Visit Again");

        input.close();

    }
}

