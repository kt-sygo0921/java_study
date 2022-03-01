package Practice17;

import java.io.IOException;

public class ExeptionPractice {
  public void exception() throws NullPointerException {
    String s = null;

    try {
      System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println("NullPointerExceptiong例外をcatchしました。");
      System.out.println("--スタックトレース（ここから）--");
      e.printStackTrace();
      System.out.println("--スタックトレース（ここまで）--");
    }
  }

  public void ioexception() throws IOException {
    throw new IOException("お手上げ");
  }
}
