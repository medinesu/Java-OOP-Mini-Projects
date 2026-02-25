public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("Burpee")) {
            this.burpeeYap(sayi);
        } else if (hareketTuru.equals("Pushup")) {
            this.pushupYap(sayi);
        } else if (hareketTuru.equals("Situp")) {
            this.situpYap(sayi);
        } else if (hareketTuru.equals("Squat")) {
            this.squatYap(sayi);
        } else {
            System.out.println("Geçersiz hareket!");
        }
    }

    public void burpeeYap(int sayi) {
        if (this.burpee_sayisi == 0) {
            System.out.println("Yapılıcak burpeee kalmadı..");
        }

        if (this.burpee_sayisi < sayi) {
            System.out.println("Hedeflediğin burpee sayısını geçtin.Tebrikler!");
            this.burpee_sayisi = 0;
            System.out.println("Kalan burpee: " + this.burpee_sayisi);
        } else {
            this.burpee_sayisi -= sayi;
            System.out.println("Kalan burpee sayısı: " + this.burpee_sayisi);
        }
    }

    public void pushupYap(int sayi) {
        if (this.pushup_sayisi == 0) {
            System.out.println("Yapılıcak pushup kalmadı..");
        }

        if (this.pushup_sayisi < sayi) {
            System.out.println("Tebrikler hedeflenen push up ı geçtiniz..");
            this.pushup_sayisi = 0;
            System.out.println("Kalan push up: " + this.pushup_sayisi);
        } else {
            this.pushup_sayisi -= sayi;
            System.out.println("Kalan push up sayısı: " + this.pushup_sayisi);
        }
    }

    public void situpYap(int sayi) {
        if (this.situp_sayisi == 0) {
            System.out.println("Yapılıcak sit up kalmadı..");
        }
        if (this.situp_sayisi < sayi) {
            System.out.println("Tebrikler hedeflenen sit upı geçtiniz..");
            this.situp_sayisi = 0;
            System.out.println("Kalan sit up: " + this.situp_sayisi);
        } else {
            this.situp_sayisi -= sayi;
            System.out.println("Kalan sit up sayısı:" + this.situp_sayisi);
        }
    }

    public void squatYap(int sayi) {
        if (this.squat_sayisi == 0) {
            System.out.println("Yapılıcak squat kalmadı..");
        }

        if (this.squat_sayisi < sayi) {
            System.out.println("Tebrikler hedeflenen squatı geçtiniz..");
            squat_sayisi = 0;
            System.out.println("Kalan squat: " + this.squat_sayisi);
        } else {
            this.squat_sayisi -= sayi;
            System.out.println("Kalan squat sayısı: " + this.squat_sayisi);
        }
    }


    public boolean idmanBittiMi() {
        return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }
}

