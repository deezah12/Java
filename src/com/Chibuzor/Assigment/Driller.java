package com.Chibuzor.Assigment;

public class Driller {

    private int amount;


    public int range(int copy) {
        {
            if (copy <= 4) {
                amount = copy * 2000;
            }
            else if (copy >= 5 && copy <= 9 ) {
                amount = copy * 1800;
            }
            else if (copy >= 10 && copy <= 29) {
                amount = copy * 1600;
            }
            else if (copy >= 30 && copy <= 49) {
                amount = copy * 1500;
            }
            else if (copy >= 50 && copy <= 99) {
                amount = copy * 1300;
            }
            else if (copy >= 100 && copy <= 199) {
                amount = copy * 1200;
            }
            else if (copy >= 200 && copy <= 499) {
                amount = copy * 1100;
            }
            else if (copy >=500) {
                amount = copy * 1000;
            }
            return amount;

        }
    }
}

