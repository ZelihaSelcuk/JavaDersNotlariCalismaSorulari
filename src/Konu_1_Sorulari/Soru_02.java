package Konu_1_Sorulari;

import java.util.Scanner;

public class Soru_02 {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini  yazdirin.

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        double girilenOndalikliSayi = scanner.nextDouble();
        System.out.println((" Girilen sayilarin toplami: " + (girilenSayi+girilenOndalikliSayi)));
        System.out.println((" Girilen sayilarin carpimi: " + (girilenSayi*girilenOndalikliSayi)));


    }
}
