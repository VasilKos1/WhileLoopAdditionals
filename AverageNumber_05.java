package BASIC.Additional_Problems_MIX.WhileLoop;

import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        double aver = 0;

        for (int i = 1; i <= n; i++) {
            int count = Integer.parseInt(scanner.nextLine());
            sum += count;
            aver = (double) sum / n;
        }


        System.out.printf("%.2f",aver);
    }
}
