package Practice18;
import java.io.*;

public class FileWriterPractice {
  public void fileWriter() throws Exception {
    FileWriter fw = new FileWriter("data.txt");
    fw.write('そ');
    fw.write('れ');
    fw.write('で');
    fw.write('は');
    fw.close();
  }
}
