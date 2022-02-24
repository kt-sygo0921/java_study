package Practice11;

public class KyotoCleaningShop implements CleaningService {
  String ownerName;
  String address;
  String phone;

  public void washShirt() {
    System.out.println("シャツを洗います");
  }

  public void washTowl() {
    System.out.println("タオルを洗います");
  }

  public void washCoat() {
    System.out.println("コートを洗います");
  }
}
