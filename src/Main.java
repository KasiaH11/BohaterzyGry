import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Janek", "mag", 2, 20.2, true);
        System.out.println(hero1);
        System.out.println(hero1.getName());
        System.out.println(hero1.getAblities());
        System.out.println(hero1.getLvl());
        System.out.println(hero1.getDamage());
        System.out.println(hero1.getFame());
        hero1.setName("Barbara");
        System.out.println(hero1.getName());
        hero1.setAblities("paladyn");
        System.out.println(hero1.getAblities());
        hero1.setDamage(41.1);
        System.out.println(hero1.getDamage());
        hero1.setFame(true);
        System.out.println(hero1.getFame());
        System.out.println(hero1.toString());
        System.out.println(hero1.damagePerSecond());
    }

}