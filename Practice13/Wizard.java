package Practice13;

class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  public String getName() {
    return this.name;
  }

  public void setname(String name) {
    this.name = name;
  }

  public void heal(Hero h) {
    int banePoint = 10;
    int recovPoint = (int)(basePoint * this.wand.getPower());

    h.setHp(h.getHp() + recovPoint);

    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }
}
