package com.design.pattern.state.example;

import java.util.Random;

/**
 * HasMoneyState
 * <p>
 * 已投入钱的状态
 *
 * @author Wenzhou
 * @since 2023/5/19 15:12
 */
public class HasMoneyState implements State {
    private VendingMachineBetter machineBetter;
    Random random = new Random();

    public HasMoneyState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }


    @Override
    public void insertMoney() {
        System.out.println("HasMoneyState---您已经投过币了,不用再投了");
    }

    @Override
    public void backMoney() {
        System.out.println("HasMoneyState---退币成功");
        machineBetter.setState(machineBetter.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        System.out.println("HasMoneyState---你转动了手柄...");
        int winner = random.nextInt(10);
        if (winner == 0 && machineBetter.getCount() > 1) {
            machineBetter.setState(machineBetter.getWinnerState());
        } else {
            machineBetter.setState(machineBetter.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("HasMoneyState---只有在 售出商品状态时才能出货!");
        throw new IllegalStateException("非法状态!");
    }
}
