package com.design.pattern.strategy.example;

/**
 * Role
 * <p>
 * 游戏角色
 *
 * @author Wenzhou
 * @since 2023/5/16 9:34
 */
public abstract class Role {
    protected String name;

    private IDisplayBehavior displayBehavior;

    private IAttackBehavior attackBehavior;

    private IDefendBehavior defendBehavior;

    public Role setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
        return this;
    }

    public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }

    public void defend() {
        defendBehavior.defend();
    }

    public void display() {
        displayBehavior.display();
    }

    public void attack() {
        attackBehavior.attack();
    }
}
