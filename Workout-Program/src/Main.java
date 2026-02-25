import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İdman programına hoşgeldiniz..");

        String idmanlar = "Gecerli hareketler:\n"
                + "-> Burpee\n"
                + "-> Push up (şınav)\n"
                + "-> Sit up (mekik)\n"
                + "-> Squat";

        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun:");
        System.out.println("Burpee sayısı: ");
        int burpee = scanner.nextInt();
        System.out.println("Push up sayısı: ");
        int pushup = scanner.nextInt();
        System.out.println("Sit up sayısı: ");
        int situp = scanner.nextInt();
        System.out.println("Squat sayısı: ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("İdmanınız başlıyor...");

        while (!idman.idmanBittiMi()) {
            System.out.println("Hareket türü (Burpee,Pushup, Situp, Squat): ");
            String tur = scanner.nextLine();
            System.out.println("Hareketten kaç tane yapıcaksınız: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();

            idman.hareketYap(tur, sayi);
        }
        System.out.println("İdmanını başarıyla bitirdin.Tebrikler!");
    }
}