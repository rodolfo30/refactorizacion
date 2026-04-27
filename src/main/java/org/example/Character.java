package org.example;

public abstract class Character {
    private int baseAttack;

    public Character(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public abstract int calculateDamage();
}
