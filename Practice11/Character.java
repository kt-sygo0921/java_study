package Practice11;

import Practice7.Matango;

public abstract class Character {
  String name;
  int hp;

  public void run() {
    System.out.println(this.name + "は逃げ出した ");
  }

  public abstract void attack(Matango m);

}
