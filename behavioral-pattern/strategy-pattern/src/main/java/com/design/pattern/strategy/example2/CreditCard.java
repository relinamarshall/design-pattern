package com.design.pattern.strategy.example2;

/**
 * CreditCard
 * <p>
 * Dummy credit card class.
 *
 * @author Wenzhou
 * @since 2023/6/1 10:21
 */
public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
