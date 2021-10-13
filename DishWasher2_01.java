package BASIC.Additional_Problems_MIX.WhileLoop;

import java.util.Scanner;

public class DishWasher2_01 {
    public static void main(String[] args) {        // 100/100
        Scanner scanner = new Scanner(System.in);
        int detergent = Integer.parseInt(scanner.nextLine());
        int quantity = detergent * 750;
        String input = scanner.nextLine();
        int sumPots = 0;
        int sumDishes = 0;
        int counter = 0;

        while (!input.equals("End")) {
            int potsDishes = Integer.parseInt(input);
            counter++;                // !!! needs to be increased in beginning, so as "%" to works !!!
            if (counter % 3 == 0) {
                quantity -= potsDishes * 15;
                sumPots+=potsDishes;
            } else {
                quantity -= potsDishes * 5;
                sumDishes+=potsDishes;
            }
            if (quantity < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(quantity));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("End")) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", sumDishes, sumPots);
            System.out.printf("Leftover detergent %d ml.", Math.abs(quantity));
        }

    }
}
