public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();

        Hesap hesap = new Hesap("medine sultan", "12345", 2000);
        atm.calis(hesap);
        System.out.print("Programdan çıkılıyor...");

    }
}
