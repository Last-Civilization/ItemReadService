package com.lastcivilization.itemreadservice.domain;

public class Details {

    private Long id;
    private int resistance;
    private int damage;
    private int strength;
    private int dexterity;
    private int defense;
    private int health;
    private int time;
    private int lvl;

    public Details(Long id, int resistance, int damage, int strength, int dexterity, int defense, int health, int time, int lvl) {
        this.id = id;
        this.resistance = resistance;
        this.damage = damage;
        this.strength = strength;
        this.dexterity = dexterity;
        this.defense = defense;
        this.health = health;
        this.time = time;
        this.lvl = lvl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public static final class Builder {

        private Long id;
        private int resistance;
        private int damage;
        private int strength;
        private int dexterity;
        private int defense;
        private int health;
        private int time;
        private int lvl;

        private Builder() {
        }

        public static Builder aDetails() {
            return new Builder();
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder resistance(int resistance) {
            this.resistance = resistance;
            return this;
        }

        public Builder damage(int damage) {
            this.damage = damage;
            return this;
        }

        public Builder strength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder dexterity(int dexterity) {
            this.dexterity = dexterity;
            return this;
        }

        public Builder defense(int defense) {
            this.defense = defense;
            return this;
        }

        public Builder health(int health) {
            this.health = health;
            return this;
        }

        public Builder time(int time) {
            this.time = time;
            return this;
        }

        public Builder lvl(int lvl){
            this.lvl = lvl;
            return this;
        }

        public Details build() {
            return new Details(id, resistance, damage, strength, dexterity, defense, health, time, lvl);
        }
    }
}
