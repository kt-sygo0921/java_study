import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      System.out.println(test("ほげほげ2"));
        fortune();
    }
        
    static String test(String args) {
        double x = 6;
        int y = 4;
        double z = x / y;
        System.out.println("hello, world!");
        System.out.println(z);
        return args;
    }
        
    static void fortune() {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        Scanner scanner = new java.util.Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("あなたの年齢を入力してください");
        String ageString = scanner.nextLine();
        scanner.close();

        int age = Integer.parseInt(ageString);
        
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("占いの結果がでました");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");
        System.out.println("占いの結果がでました");
    }
}