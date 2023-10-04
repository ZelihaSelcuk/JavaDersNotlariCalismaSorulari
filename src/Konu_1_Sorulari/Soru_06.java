package Konu_1_Sorulari;

import java.util.Scanner;

public class Soru_06 {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Dairenin Yarıçapını Giriniz:");
        int yaricap= scanner.nextInt();

        System.out.println("Dairenin Alanı:" + (yaricap * yaricap * 3.14));
        System.out.println("Dairenin Çevresi:" + (2*yaricap * 3.14));


    }
}
