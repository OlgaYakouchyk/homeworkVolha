package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you amount in euro: ");
        double euroAmount = scanner.nextDouble();
        double exchangeRate = 1.2;

        System.out.println("You amount in USD is: " + convertEuroToUSD(euroAmount,exchangeRate));
    }

    public static double convertEuroToUSD (double euroAmount, double exchangeRate){
        double result = euroAmount * exchangeRate;
        return result;

    }
}
