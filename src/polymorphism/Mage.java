package polymorphism;

public class Mage extends Hero {
    private int accumulationBonus = 0;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг " + name + " атакует");
        enemy.takeDamage(calculateBonusDamage());
    }

    private int calculateBonusDamage() {
        accumulationBonus++;
        int bonusDamage = 5;
        int damage = 5;
        return damage + (bonusDamage * accumulationBonus);
    }
}