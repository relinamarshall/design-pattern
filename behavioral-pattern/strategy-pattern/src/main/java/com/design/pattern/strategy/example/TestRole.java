package com.design.pattern.strategy.example;

/**
 * TestRole
 *
 * @author Wenzhou
 * @since 2023/5/16 9:53
 */
public class TestRole {
    public static void main(String[] args) {
        RoleA a = new RoleA();
        a.setDefendBehavior(new DefendTBS());
        a.setAttackBehavior(new AttackXL());
        a.setDisplayBehavior(new DisplayGZ());
        a.display();
        a.defend();
        a.attack();

        RoleB b = new RoleB();
        b.setDefendBehavior(new DefendJZZ());
        b.setAttackBehavior(new AttackXL());
        b.setDisplayBehavior(new DisplayGZ());
        b.display();
        b.defend();
        b.attack();
    }
}
