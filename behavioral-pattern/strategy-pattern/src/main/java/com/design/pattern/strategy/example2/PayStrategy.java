package com.design.pattern.strategy.example2;

/**
 * PayStrategy
 * <p>
 * Common interface for all strategies.
 *
 * @author Wenzhou
 * @since 2023/6/1 10:15
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
