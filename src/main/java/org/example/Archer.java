package org.example;

public class Archer extends Character {
    public Archer(int baseAttack) { super(baseAttack); }
    @Override
    public int calculateDamage() { return getBaseAttack() + 3; }
}
