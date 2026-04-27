package org.example;

public class Warrior extends Character {
    public Warrior(int baseAttack) { super(baseAttack); }
    @Override
    public int calculateDamage() { return getBaseAttack() + 2; }
}