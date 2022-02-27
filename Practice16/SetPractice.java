package Practice16;

import java.util.Set;
import java.util.HashSet;

public class SetPractice {
  public void set() {
    Set<String> colors = new HashSet<>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    colors.add("赤");
    System.out.println("色は" + colors.size() + "種類");
  }
}
