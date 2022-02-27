package Practice16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
//    16-2
    ArrayList<Hero> heros = new ArrayList();
    heros.add(new Hero("斎藤"));
    heros.add(new Hero("鈴木"));

    Iterator<Hero> it = heros.iterator();
    while(it.hasNext()) {
      System.out.println(it.next().getName());
    }
//    16-3
    Hero saito = new Hero("斎藤");
    Hero suzuki = new Hero("鈴木");

    Map<Hero, Integer> herosMap = new HashMap<>();
    herosMap.put(saito, 3);
    herosMap.put(suzuki, 7);

    for(Hero key : herosMap.keySet()) {
      int value = herosMap.get(key);
      System.out.println(key.getName() + "が倒した敵=" + value);
    }
  }
}
