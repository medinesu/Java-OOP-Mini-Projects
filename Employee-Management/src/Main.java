/* çalışanlar programı
çalışan sınıfı adında bir üst sınıf
çalışan sınıfından türeyen yazılımcı adında bir alt sınıf
çalışan sınıfından türeyen yönetici adında bir alt sınıf
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanlar programına hoş geldiniz...");

        String islemler = "İşlemler: \n"
                        + "1. Yazılımcı İşlemleri\n"
                        + "2. Yönetici İşlemleri\n"
                        + "Çıkış için q ya basın.";
        System.out.println("*************************************");
        System.out.println(islemler);
        System.out.println("*************************************");

        while (true) {
            System.out.print("Yapmak istediğiniz işlemi seçin: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.print("Sistemden çıkılıyor..");
                break;
            }
            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("medine sultan", "efe", 123, "Phyton, C, Java");
                String yazilimci_islem = "Yazılımcı işlemleri:\n"
                                        + "1. Format At\n"
                                        + "2. Bilgileri Göster\n"
                                        + "Çıkış için q'ya basın.";
                System.out.println(yazilimci_islem);
                while (true) {
                    System.out.print("İşlem seçin: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor..");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("İşletim sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")) {

                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz yazılımcı işlemi..");
                    }
                }
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("zeynep", "efe", 125, 20);
                String yonetici_islem = "Yönetici işlemleri:\n"
                                        + "1. Zam yap\n"
                                        + "2. Bilgileri göster\n"
                                        + "Çıkış için q'ya basın.";
                System.out.println(yonetici_islem);
                while (true) {
                    System.out.println("İşlem seçin: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.print("Yönetici işlemlerinden çıkılıyor..");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("Zam yapmak istediğiniz miktarı girin: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();  //boş karakteri algıladığı için yaptık.
                        yonetici.zamYap(zamMiktari);
                    }
                    else if (y_islem.equals("2")) {

                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz yönetici işlemi girdiniz!");
                    }
                }
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}



