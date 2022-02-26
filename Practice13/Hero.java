package Practice13;

import Practice7.Sword;

class Hero {
  private int hp = 100;
  private String name;
  Sword sword;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return this.hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }

  public void bye() {
    System.out.println("勇者は別れを告げた");
  }

  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVERです。");
  }

  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した！");
  }

  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("おばけキノコ" + m.suffix + "から2ポイントの反撃を受けた");
    this.hp -=2;
    if(this.hp <= 0) {
      this.die();
    }
  }
}
