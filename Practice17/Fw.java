package Practice17;

import java.io.FileWriter;

public class Fw {
  public void fileWriter() {
    try(FileWriter fw = new FileWriter("data.txt")) {
      fw.write("hello");
    } catch (Exception e) {
      System.out.println("なんらかのエラーが発生しました");
    }
  }
}
