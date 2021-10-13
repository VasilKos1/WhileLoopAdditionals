package BASIC.Additional_Problems_MIX.WhileLoop;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {            //60/100
        Scanner scanner = new Scanner(System.in);
        int bottlesDetergent = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int sumPots = 0;           // count pots   ; need to store dishes and pots separately !!!
        int sumDishes = 0;         // count dishes
        int consumptionPots = 0;     // consumption in ml.
        int consumptionDishes = 0;  //// consumption in ml.

        //int leftDetergent = 0;
        int count = 0;
        int quantityDetergent = bottlesDetergent * 750;

        while (!command.equals("End")) {
            int dishesOrPots = Integer.parseInt(command);  // command !!!
            count++;
            if (count % 3 == 0) {
                sumPots += dishesOrPots;
                consumptionPots = dishesOrPots * 15;
                quantityDetergent -= consumptionPots;

            } else {
                sumDishes += dishesOrPots;
                consumptionDishes = dishesOrPots * 5;
                quantityDetergent -= consumptionDishes;
            }
            if (quantityDetergent < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(quantityDetergent));
            }
            command = scanner.nextLine();
        }
        if (quantityDetergent >= 0) {

            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", sumDishes, sumPots);
            System.out.printf("Leftover detergent %d ml.", quantityDetergent);
        }


    }
}
