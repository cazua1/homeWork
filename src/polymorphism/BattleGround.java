package polymorphism;

public class BattleGround {
    public static void main(String[] args) {
        Hero hero1 = new Warrior("Bob", 180);
        Hero hero2 = new Archer("Bub", 80);
        Hero hero3 = new Mage("Bip", 100);
        Enemy enemy1 = new Vampire(100);
        Enemy enemy2 = new Ghost(80);


        while (hero1.isAlive() && enemy1.isAlive()){
            hero1.attackEnemy(enemy1);
            enemy1.attackHero(hero1);
        }

        if (!hero1.isAlive() && !enemy1.isAlive()){
            System.out.println("Оба мертвы");
        } else if (hero1.isAlive()){
            System.out.println("Герой " + hero1.getName() + " победил");
        } else if (enemy1.isAlive()) {
            System.out.println("Враг победил");
        }
    }
}