package Practice16;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayPractice {
  public void array() {
    String[] names = new String[3];

    names[0] = "たなか";
    names[1] = "すずき";
    names[2] = "さいとう";
  }

  public void arrayList() {
    ArrayList<String> names = new ArrayList<String>();

    names.add("たなか");
    names.add("すずき");
    names.add("さいとう");

    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);
  }

  public void iterator() {
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);

    Iterator<Integer> it = points.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
