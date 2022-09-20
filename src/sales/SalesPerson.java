package sales;


import java.math.BigDecimal;

public class SalesPerson {

    private Item[] soldItems;
    private final double WEEKLY_PAY = 200;
    private  final  double COMMISON_RATE = 0.09;

    public Item[] getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(Item[] soldItems) {
        this.soldItems = soldItems;
    }
    public  double calculateEarnings(){
        double commision = BigDecimal.ZERO.doubleValue();
        for (int i = 0; i < soldItems.length; i++) {
            commision += soldItems[i].getValueSold() *  COMMISON_RATE;

        }
        double earnings = commision + WEEKLY_PAY;
        return earnings;
    }
}
