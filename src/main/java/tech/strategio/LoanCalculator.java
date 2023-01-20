package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * P- the loan amount
     * R- calculates and outputs the remaining amount after 3 months
     * E- Month 1
     *      Payment: 10% of 20000 = 2000
     *      Remaining amount: 18000
     * Month 2
     *      Payment: 10% of 18000 = 1800
     *      Remaining amount: 16200
     * Month 3:
     *      Payment: 10% of 16200 = 1620
     *      Remaining amount: 14580
     * P-
     * @param ??? The initial loan amount
     * @return ??? The remaining loan amount after 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        int currentAmount = amount;
        int payment;

        for (int i = 1; i <= 3; i++){
            payment = (int) (currentAmount * 0.1);
            currentAmount -= payment;
        }

        return currentAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
