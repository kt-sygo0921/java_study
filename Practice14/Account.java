package Practice14;

public class Account {
  String accountNumber;
  int balance;

  public Account(String accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void accountInformation() {
    System.out.println("¥" + this.balance + "(口座番号:" + this.accountNumber + ")");
  }

  public boolean equals(String accountNumber) {
    String trimNumber1 = this.accountNumber.trim();
    String trimNumber2 = accountNumber.trim();
    return trimNumber1.equals(trimNumber2);
  }
}
