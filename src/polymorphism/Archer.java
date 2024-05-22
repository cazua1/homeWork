package polymorphism;

import java.util.Random;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + name + " атакует");
        enemy.takeDamage(calculateCriticalDamage());
    }

    private int calculateCriticalDamage() {
        Random random = new Random();
        int damage = 10;
        int chance = 25;
        int criticalRate = 2;
        int roll = random.nextInt(100);

        if (roll <= chance) {
            return damage * criticalRate;
        } else {
            return damage;
        }
    }
}