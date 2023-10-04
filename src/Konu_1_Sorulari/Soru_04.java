package Konu_1_Sorulari;

import java.util.Scanner;

public class Soru_04 {
    public static void main(String[] args) {

  //      Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini  yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lüttfen dikdörtgenin 1. kenarını giriniz.");
        int kenar1 = scanner.nextInt();
        System.out.println("Lüttfen dikdörtgenin 1. kenarını giriniz.");
        int kenar2 = scanner.nextInt();

        System.out.println("Dikdörtgenin Alanaı :" + (kenar1*kenar2));


    }
}
