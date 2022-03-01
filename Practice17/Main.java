package Practice17;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Person p = new Person();
    p.setAge(125);
    try {
      throw new UnsupportedMusicFileException("未対応の音楽ファイルです");
    } catch (Exception e) {
      e.printStackTrace();
    }

//    練習問題
    ExeptionPractice test = new ExeptionPractice();
    test.exception();

    try {
      int i = Integer.parseInt("三");
    } catch (NumberFormatException e2) {
      e2.printStackTrace();
    }

    test.ioexception();
  }
}
