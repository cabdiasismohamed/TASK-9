package conversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner TASK9 = new Scanner(System.in);
        System.out.print("Enter source currency (UGX, SOS, SSP, USD) ");
        String from = TASK9.next();

        System.out.print("Enter target currency (USD, UGX, SOS, SSP) ");
        String to = TASK9.next();

        System.out.print("Enter The amount: ");
        double amount = TASK9.nextDouble();
    }
}
