package polymorphism;

import java.util.Random;

public class Ghost extends Enemy{
    public Ghost(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 15;
        System.out.println("Призрак атакует");
        hero.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage){
        if (isAlive()) {
            Random random = new Random();
            int finalDamage;
            int chanceToDodge = 25;
            int roll = random.nextInt(100);

            if (roll <= chanceToDodge) {
                finalDamage = 0;
            } else {
                finalDamage = damage;
            }
            health -= finalDamage;
        }
    }
}