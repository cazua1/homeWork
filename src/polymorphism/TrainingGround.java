package polymorphism;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero1 = new Warrior("Bob", 100);
        Hero hero2 = new Archer("Bub", 80);
        Hero hero3 = new Mage("Bip", 100);
        Enemy enemy1 = new Vampire(100);
        Enemy enemy2 = new Ghost(80);

        hero1.attackEnemy(enemy1);
        hero2.attackEnemy(enemy2);
        hero3.attackEnemy(enemy1);
    }
}