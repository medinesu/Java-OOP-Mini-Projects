public class Main {


    public static void main(String[] args) {
        System.out.println("SABİHA GÖKÇEN HAVALİMANINA HOŞGELDİNİZ...");

        String sartlar = "Yurtdışı Çıkış Kuralları:\n"
                        + "-> Herhangi bir siyasi yasağınızın bulunmaması gerekiyor.\n"
                        + "-> 15 TL Harç bedelini yatırmanız gerekiyor.\n"
                        + "-> Gideceğiniz ülkeye vizenizin olması gerekiyor.\n";
        String message = "Kuralların hepsini sağlamanız gerekiyor..";

        while (true) {
            System.out.println("********************************************************");
            System.out.println(sartlar);
            System.out.println("********************************************************");


            Yolcu yolcu = new Yolcu();   //boş constructorı çağırdık.

            System.out.println("Harç bedeli kontrol ediliyor..");

            //Thread.sleep(3000);   // 3 sn bekler öyle çalışır.

            if (yolcu.yurtdisiHarciKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor..");

            //Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor..");

            //Thread.sleep(3000);

            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamam. Yurtdışına çıkabilirsiniz!");
            break;
        }
    }
}
