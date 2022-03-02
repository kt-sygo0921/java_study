package Practice18;

public class Main {
  public static void main(String[] args) {
//    FileWriterPractice fwp = new FileWriterPractice();
//    try {
//      fwp.fileWriter();
//    } catch (Exception e) {
//      System.out.println("ファイル書き込みができなかったです");
//    }

    FileReaderPractice frp = new FileReaderPractice();
    try {
      frp.fileReader();
    } catch (Exception e) {
      System.out.println("ファイル読み込みができなかったです");
    }

    AccessUrlPractice aup = new AccessUrlPractice();
    try {
      aup.getPage();
    } catch (Exception e) {
      System.out.println("ページ取得に失敗しました");
    }
  }
}
