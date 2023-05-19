package com.design.pattern.state.example;

/**
 * @author Wenzhou
 * @since 2023/5/19 15:20
 */
public class TestVendingMachine {
    public static void main(String[] args) {
        VendingMachineBetter machineBetter = new VendingMachineBetter(4);
        // 正常: 投币  退币  摇杆

        System.out.println("测试:----------------------");
        machineBetter.insertMoney();
        machineBetter.turnCrank();
        machineBetter.insertMoney();
        machineBetter.turnCrank();
        machineBetter.insertMoney();
        machineBetter.turnCrank();
        machineBetter.insertMoney();
        machineBetter.turnCrank();

        System.out.println("压力测试:----------------------");
        machineBetter.insertMoney();
        machineBetter.insertMoney();
        machineBetter.insertMoney();
        machineBetter.backMoney();
        machineBetter.backMoney();
        machineBetter.backMoney();
        machineBetter.turnCrank();
        machineBetter.turnCrank();
        machineBetter.turnCrank();
    }
}
