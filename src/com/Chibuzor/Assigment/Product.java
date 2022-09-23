package com.Chibuzor.Assigment;

    public class Product {

        private String productName;
        private int quantity;
        private double price;
        private double totalPrice;
        private String customerName;

        public Product(String productName, int quantity, double price, double totalPrice){

            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
            this.totalPrice = totalPrice;
        }

        public String getProductName() {
            return productName;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public void setCustomerName(String customerName){
            this.customerName = customerName;
        }

        public String getCustomerName() {
            return customerName;
        }

        public static void displayFormat(){
            System.out.println("========================================================================================");
            System.out.println("========================================================================================");
            System.out.print("  \nITEM\t\t\tQTY\t\t\tPRICE\t\t\t\tTOTAL(NGN)\n");
            System.out.println("=========================================================================================");
            System.out.println("=========================================================================================");
        }


        public void display(){
            System.out.printf("  %-9s    %5d         %9.2f       %14.2f\n" ,productName,quantity,price,totalPrice);
        }
    }



