package Practice16;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimePractice {
  public void time() {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    LocalDate ldate = LocalDate.parse("2020/09/22", fmt);

    LocalDate ldatep = ldate.plusDays(1000);
    String str = ldatep.format(fmt);
    System.out.println("1000日後は" + str);

    LocalDate now = LocalDate.now();
    if (now.isAfter(ldatep)) {
      System.out.println("1000日後は過去日付です");
    }

    LocalDate d1 = LocalDate.of(2020,1,1);
    LocalDate d2 = LocalDate.of(2020,1,4);

    Period p1 = Period.ofDays(3);
    Period p2 = Period.between(d1,d2);
    System.out.println(d1.plusDays(3));
  }
}
