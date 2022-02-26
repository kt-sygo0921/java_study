package Practice16;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.*;

public class AddText {
  public void addText() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      sb.append(i + 1).append(",");
    }
    String[] strArray = sb.toString().split(",");

    System.out.println(sb.toString());
  }

  public void concatPath() {
    String folder = "c:¥javadev";
    String file = "readme.txt";

    if (folder.endsWith("¥")) {
      System.out.println(folder + file);
    } else {
      System.out.println(folder + "¥" + file);
    }
  }

  public void datePattern() {
    Date d = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(d);
    c.add(Calendar.DAY_OF_MONTH, 100);
    Date d2 = c.getTime();

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("西暦yyyy年MM月dd日");

    System.out.println(simpleDateFormat.format(d2));
  }

  public void timePattern() {
    LocalDate l = LocalDate.now();
    l.plusDays(100);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");

    System.out.println(l.format(fmt));
  }
}
