package com.design.pattern.strategy.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * PayByCreditCard
 * <p>
 * Concrete strategy. Implements credit card payment method.
 *
 * @author Wenzhou
 * @since 2023/6/1 10:20
 */
public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * After card validation we can charge customer's credit card.
     *
     * @param paymentAmount int
     * @return boolean
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            System.out.println("Surplus amount " + card.getAmount());
            return true;
        } else {
            return false;
        }
    }

    /**
     * Collect credit card data.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // Validate credit card number...

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
