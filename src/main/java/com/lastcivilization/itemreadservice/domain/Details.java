package com.lastcivilization.itemreadservice.domain;

class Details {

    private Long id;
    private int resistance;
    private int damage;
    private int strength;
    private int dexterity;
    private int defense;
    private int health;
    private int time;
    private int lvl;

    Details(Long id, int resistance, int damage, int strength, int dexterity, int defense, int health, int time, int lvl) {
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

    Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    int getResistance() {
        return resistance;
    }

    void setResistance(int resistance) {
        this.resistance = resistance;
    }

    int getDamage() {
        return damage;
    }

    void setDamage(int damage) {
        this.damage = damage;
    }

    int getStrength() {
        return strength;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    int getDexterity() {
        return dexterity;
    }

    void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    int getDefense() {
        return defense;
    }

    void setDefense(int defense) {
        this.defense = defense;
    }

    int getHealth() {
        return health;
    }

    void setHealth(int health) {
        this.health = health;
    }

    int getTime() {
        return time;
    }

    void setTime(int time) {
        this.time = time;
    }

    int getLvl() {
        return lvl;
    }

    void setLvl(int lvl) {
        this.lvl = lvl;
    }

    static final class Builder {

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

        static Builder aDetails() {
            return new Builder();
        }

        Builder id(Long id) {
            this.id = id;
            return this;
        }

        Builder resistance(int resistance) {
            this.resistance = resistance;
            return this;
        }

        Builder damage(int damage) {
            this.damage = damage;
            return this;
        }

        Builder strength(int strength) {
            this.strength = strength;
            return this;
        }

        Builder dexterity(int dexterity) {
            this.dexterity = dexterity;
            return this;
        }

        Builder defense(int defense) {
            this.defense = defense;
            return this;
        }

        Builder health(int health) {
            this.health = health;
            return this;
        }

        Builder time(int time) {
            this.time = time;
            return this;
        }

        Builder lvl(int lvl){
            this.lvl = lvl;
            return this;
        }

        Details build() {
            return new Details(id, resistance, damage, strength, dexterity, defense, health, time, lvl);
        }
    }
}
