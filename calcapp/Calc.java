package calcapp;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = plus(a, b);
        int delta = minus(a, b);
        System.out.println("足すと" + total + "、引くと" + delta);
    }

    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }
}
