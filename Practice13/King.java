package Practice13;

class King {
  public void talk(Hero h) {
    System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ。");
    System.out.println("王様：まずは城下町をみてくるとよい。ではまた会おう。");
    h.bye();
  }
}
