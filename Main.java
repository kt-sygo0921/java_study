import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
//     System.out.println(test("ほげほげ2"));
//     fortune();
//    ifTest();
//    whileTest();
//    forTest();
//    hungry();
//    arrayTest();∑
//    System.out.println(calcCircleArea(5.0));
//    System.out.println((calcTriangleArea(10, 5)));
//    Calc.main();
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

  static void ifTest() {
    boolean tenki = true;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
      System.out.println("DVDを見ます");
    }

    String str = "夕日a";
    if (str.equals("夕日a")) {
      System.out.println("夕日です");
    }
  }

  static void whileTest() {
    int temp = 25;

    while (temp > 25) {
      temp--;
      System.out.println("温度が" + temp + "度になりました");
    }
    // do {
    //   temp--;
    //   System.out.println("温度が" + temp + "度になりました");
    // } while(temp > 25);
  }

  static void forTest() {
    for (int i = 0; i < 10; i++) {
      System.out.println("こんにちは");
    }
  }

  static void hungry() {
    int isHungry = 1;
    String food = "お肉";

    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("はらぺこです");
    }

    if (isHungry == 1) {
      System.out.println(food + "をいただきます");
    }

    System.out.println("ごちそうさまでした");
  }

  static void arrayTest() {
    int[] score = new int[5];
    score[0] = 50;
    System.out.println(score[0]);

    int[] score1 = {112, 2, 3};
    System.out.println(score1[0]);

    int[] seq = new int[10];

    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }

    for (int i = 0; i < seq.length; i++) {
      char[] base = {'A', 'T', 'G', 'C'};
      System.out.print(base[seq[i]] + " ");
    }
    System.out.println("");

    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int value : numbers) {
      if (value == input) {
        System.out.println("アタリ！");
      }
    }
  }

  static double calcTriangleArea(double bottom, double height) {
    return bottom * height / 2;
  }

  static double calcCircleArea(double radius) {
    return radius * radius * 3.14;
  }
}