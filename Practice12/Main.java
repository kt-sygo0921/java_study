package Practice12;

import Practice7.Matango;

public class Main {
  public static void main (String[] args) {
    Wizard w = new Wizard();
    Matango m = new Matango();

    w.name = "アサカ";
    w.attck(m);
    w.fireball(m);

    Wizard w2 = new Wizard();
    Matango m2 = new Matango();

    Character c = w;
    c.name = "アサカ";
    c.attck(m);
//    実体はWizardだが型がCharacterのためエラーになる
//    c.fireball(m);

    A a = new A();
    B b = new B();
    Y[] y = new Y[2];
    y[0] = a;
    y[1] = b;

    for (Y value: y) {
      value.b();
    }

  }
}
