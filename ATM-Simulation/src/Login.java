import java.util.Scanner;

public class Login {

    public  boolean login(Hesap hesap){  //parametre olarak obje gönderdik Hesap classımızdaki obje hesap ise referansımız.

        Scanner scanner = new Scanner(System.in);

        String kullanici_adi;
        String parola;

        System.out.print("Lütfen kullanıcı adınızı girin: ");
        kullanici_adi = scanner.nextLine();
        System.out.println("Lütfen parolanızı girin: ");
        parola = scanner.nextLine();

        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {

            return true;
        }
        else {
            return false;
        }

        }
    }



