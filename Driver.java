import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        System.out.println("How much do you earn?");
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        double sum = 0;
        int i = 0;
        ArrayList<Double> proportion = new ArrayList<Double>();
        System.out.println("Enter rent expense:");
        int rent = scan.nextInt();
        System.out.println("Enter food and grocery expense:");
        int foodAndGroceries = scan.nextInt();
        System.out.println("Enter transport expense:");
        int transport = scan.nextInt();
        System.out.println("Enter savings:");
        int savings = scan.nextInt();
        System.out.println("Enter other expenses:");
        int others = scan.nextInt();
        do {
            System.out.println("Your proportion of expense " + 
            (i + 1) + ":");
             double value = scan.nextDouble();
             proportion.add(value);
             sum = rent + foodAndGroceries + transport + savings + others;
             i++;

        } while (sum <= 100);
        scan.close();
        if (sum > 100) {
            for (int j = 0; j < proportion.size() - 1; j++) {
                sum += proportion.get(j);
            }
            proportion.set(proportion.size() - 1,
                100.0 - sum);
        }
        for (double value : proportion) {
            double expense = value * total/100.0;
            System.out.println("Your " + value + "% equals $ " + expense);
        }
    }
}