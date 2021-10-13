package BASIC.Additional_Problems_MIX.WhileLoop;

import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedSum = Integer.parseInt(scanner.nextLine());
        int countCredit = 0;
        int countCash = 0;
        int countTotal = 0;
        int sumCredit = 0;
        int sumCash = 0;
        int sumTotal = 0;

        String command = scanner.nextLine();
        while (!command.equals("End") && sumTotal < expectedSum) {
            int prices = Integer.parseInt(command);
            countTotal++;
            if (countTotal % 2 == 0) {   // -> credit payment
                //countCredit++;         // should be done in the next else, or count will be doubled
                if (prices < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    countCredit++;
                    sumCredit += prices;
                    sumTotal += prices;
                    System.out.println("Product sold!");
                }
            } else {           //-> cash payment
                //countCash++;
                if (prices > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    countCash++;
                    sumCash += prices;
                    sumTotal += prices;
                    System.out.println("Product sold!");
                }
            }            // Програмата приключва или след като получим команда "End"  или след като средствата бъдат събрани.!!!
            if (sumTotal >= expectedSum) {     // !!! otherwise gives 50/100
                break;
            }
            command = scanner.nextLine();
        }
        double averCash = (double) sumCash / countCash;
        double averCredit = (double) sumCredit / countCredit;

        if (sumTotal < expectedSum) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%n", averCash);
            System.out.printf("Average CC: %.2f%n", averCredit);
        }


    }

}
