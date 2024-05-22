package polymorphism;

import Interfaces.Mortal;

public abstract class Enemy implements Mortal {
    protected int health;

    public Enemy(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void takeDamage(int damage){
        if (isAlive()) {
            health -= damage;
        }
    };

    public abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive(){
        return health > 0;
    }
}