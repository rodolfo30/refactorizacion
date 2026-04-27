package org.example;

public class Mage extends Character {
    public Mage(int baseAttack) { super(baseAttack); }
    @Override
    public int calculateDamage() { return getBaseAttack() + 5; }
}
