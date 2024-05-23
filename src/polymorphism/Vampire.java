package polymorphism;

public class Vampire extends Enemy{

    public Vampire(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 10;
        System.out.println("Вампир атакует");
        hero.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage){
        if (isAlive()) {
            int lifeSteal = 5;
            health -= damage;
            health += lifeSteal;
        }
    }
}