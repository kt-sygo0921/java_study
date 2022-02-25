package Practice12;

import Practice12.Character;
import Practice7.Matango;

public class Wizard extends Character {
  int mp;

  public Wizard() {
    super();
  }

  public void attck(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に3ポイントのダメージ！");
    m.hp -= 3;
  }

  public void fireball(Matango m) {
    System.out.println(this.name + "は火の玉を放った！");
    System.out.println("敵に20ポイントのダメージ");
    m.hp -= 20;
    this.mp -= 5;
  }
}
