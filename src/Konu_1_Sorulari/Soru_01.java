package Konu_1_Sorulari;

import java.util.Scanner;

public class Soru_01 {
    public static void main(String[] args) {

    // Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla  yazdirin.


        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();
        System.out.println((" Girilen Tamsayi : " + girilenSayi));


        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        double girilenOndalikliSayi = scanner.nextDouble();
        System.out.println((" Girilen ondalikli sayi : " + girilenOndalikliSayi));

        System.out.println("Lütfen bir isim Giriniz");
        String girilenisim = scanner.next();
        System.out.println((" Girilen İsim : " + girilenisim));






    }
}
