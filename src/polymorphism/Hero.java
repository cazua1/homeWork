package polymorphism;

import Interfaces.Mortal;

public abstract class Hero implements Mortal {
    protected final String name;
    private int health;

    public Hero (String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void takeDamage(int damage){
        if (isAlive()) {
            health -= damage;
        }
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive(){
        return health > 0;
    }
}