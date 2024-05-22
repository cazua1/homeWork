package polymorphism;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 10;
        System.out.println("Воин " + name + " атакует");
        enemy.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(calculateBlockDamage(damage));
    }

    private int calculateBlockDamage(int damage) {
        int blockDamage = 20;
        damage -= blockDamage * damage / 100;
        return damage;
    }
}