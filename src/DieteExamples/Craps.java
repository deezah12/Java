package DieteExamples;

        import java.security.SecureRandom;
        import java.util.concurrent.CopyOnWriteArraySet;

    public class Craps {
    private static final SecureRandom radomnumbers = new SecureRandom();
    private enum  Status {WIN, LOST,CONTINUE}
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WIN;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("point is %d%n", myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WIN;
            }
            else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }

            }
        }


        if(gameStatus == Status.WIN) {
            System.out.println("player wins");
        }
        else{
            System.out.println("player loose");
        }
    }
    public static int rollDice(){
        int die1 = 1 + radomnumbers.nextInt(6);
        int die2 = 2 + radomnumbers.nextInt(6);

        int sum = die1 + die2;
        System.out.printf("player rolled %d + %d = %d%n", die1, die2,sum);
        return sum;
    }


}





