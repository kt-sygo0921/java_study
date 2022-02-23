package Practice7;

public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;


        Hero h1 = new Hero("ミナト");
        h1.sword = s;

        Hero h2 = new Hero("アサカ");
        h2.sword = s;

        Hero h3 = new Hero();
        h3.sword = s;

        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp =  50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        h1.attack();

        h1.slip();
        m1.run();
        m2.run();
        h1.run();
        h3.run();
    }
}
