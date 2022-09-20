package com.chapter3;

public class Invoice {

    private String partNumber;
    private String description;
    private  int purchased;
    private double pricePerItem;

    public Invoice(String partNumber, String descp, int pur, double price) {
        this.partNumber = partNumber;
        description = descp;
        purchased = pur;
        pricePerItem = price;



    }

}
