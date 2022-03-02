package Practice18;

import java.io.InputStream;
import java.net.URL;

public class AccessUrlPractice {
  public void getPage() throws Exception {
    URL u = new URL("https://book.impress.co.jp");
    InputStream is = u.openStream();
    int i = is.read();
    while (i != -1) {
      char c = (char)i;
      System.out.print(c);
      i = is.read();
    }
  }
}
