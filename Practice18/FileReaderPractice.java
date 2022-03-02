package Practice18;

import java.io.*;

public class FileReaderPractice {
  public void fileReader() throws Exception {
    FileReader fr = new FileReader("data.txt");
    int input = fr.read();
    while (input != -1) {
      System.out.println((char) input);
      input = fr.read();
    }
    fr.close();
  }
}
