package Konu_1_Sorulari;

import java.util.Scanner;

public class Soru_05 {
    public static void main(String[] args) {

   // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen isminizi Giriniz");
        String girilenisim = scanner.next();

        System.out.println("Lütfen soyisminizi Giriniz");
        String girilensoyisim = scanner.next();

        System.out.println("Lütfen yaşınızı giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen Bilgiler: " + girilenisim.toUpperCase().charAt(0) +
                " " + girilensoyisim.toUpperCase().substring(0,1) + girilensoyisim.toLowerCase().substring(1)+ ", " + girilenSayi);



    }
}
