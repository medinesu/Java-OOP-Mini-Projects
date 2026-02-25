import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {     //constructor
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatırdığınız harcı girin: ");
        this.harc = scanner.nextInt();  //yukarda tanımladığımız harca kullanıcıdan aldığımız girdiyi atadık.
        scanner.nextLine();

        System.out.print("Siyasi yasağınız bulunuyor mu?(evet/hayır): ");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        }
        else {
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu?(evet/hayır): ");
        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")) {
            this.vizeDurumu = true;
        }
        else {
            this.vizeDurumu = false;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasağınız bulunuyor.Yurt dışına çıkamazsınız! ");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor..");
            return true;
        }
    }

    @Override
    public boolean yurtdisiHarciKontrol() {

       if (this.harc < 15) {
           System.out.println("Lütfen yurt dışı harcını tam yatırın!");
           return false;
       }
       else {
           System.out.println("Yurt dışı harcı işlemi tamam!");
           return true;
       }
    }

    @Override
    public boolean vizeDurumuKontrol() {

        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleriniz tamam!");
            return true;
        }
        else {
            System.out.println("Gidiceğiniz ülkeye vizeniz bulunmamaktadır!");
            return false;
        }
    }
}
