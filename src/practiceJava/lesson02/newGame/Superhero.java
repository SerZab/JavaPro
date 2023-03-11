package practiceJava.lesson02.newGame;

import java.util.Random;

public class Superhero {
    private String name;
    private int health;
    private int force;
    private Weapon weapon;
    private Protection protection;

    public Superhero(String name, int health, int force, Weapon weapon, Protection protection) {
        this.name = name;
        this.health = health;
        this.force = force;
        this.weapon = weapon;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void fight(Superhero other) {
        int damage = (this.force + this.weapon.getForce()) - (other.force + other.protection.getLevel());
        other.health -= damage;
        System.out.println(this.name + " атакует " + other.name + " с " + this.weapon.getName() +
                " и наносит " + damage + " урон");
        System.out.println(other.name + " сейчас здоровье " + other.health);
    }

    public static Superhero generateRandomSuperhero() {
        String[] names = {"Бэтман", "Суперман", "Человек паук", "Железный человек", "Торр"};
        Random rand = new Random();
        String name = names[rand.nextInt(names.length)];
        int health = 100;
        int force = rand.nextInt(10) + 1;
        Weapon weapon = Weapon.generateRandomWeapon();
        Protection protection = Protection.generateRandomProtection();
        return new Superhero(name, health, force, weapon, protection);
    }

    @Override
    public String toString() {
        return "Супергерой {" +
                "" + name +
                ", здоровье = " + health +
                ", сила = " + force +
                ", оружие = " + weapon +
                ", защита = " + protection +
                '}';
    }
}

class Weapon {
    private String name;
    private int force;

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public int getForce() {
        return force;
    }

    public static Weapon generateRandomWeapon() {
        String[] names = {"Меч", "Топор", "Молот", "Кинжал", "Арбалет"};
        Random rand = new Random();
        String name = names[rand.nextInt(names.length)];
        int force = rand.nextInt(5) + 1;
        return new Weapon(name, force);
    }

    @Override
    public String toString() {
        return "{" +
                "" + name +
                ", " + force +
                '}';
    }
}

class Protection {
    private String name;
    private int level;

    public Protection(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public static Protection generateRandomProtection() {
        String[] names = {"Щит", "Броня", "Шлем", "Наголенники", "Перчатки"};
        Random rand = new Random();
        String name = names[rand.nextInt(names.length)];
        int level = rand.nextInt(5) + 1;
        return new Protection(name, level);
    }

    @Override
    public String toString() {
        return "{" + name +
                ", " + level +
                '}';
    }
}
