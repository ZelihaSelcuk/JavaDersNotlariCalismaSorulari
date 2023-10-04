package Konu_1_Sorulari;

import java.util.Scanner;

public class Soru_03 {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.


        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen isminizi Giriniz");
        String girilenisim = scanner.next();

        System.out.println("Lütfen soyisminizi Giriniz");
        String girilensoyisim = scanner.next();

        System.out.println("Lütfen yaşınızı giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println(("İsminiz: " + girilenisim.toUpperCase().charAt(0) + girilenisim.substring(1)));
        System.out.println(("Soy İsminiz: " + girilensoyisim.toUpperCase().charAt(0) + girilensoyisim.substring(1)));
        System.out.println("Yaşınız: "+ girilenSayi);



    }
}
