import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini alıyoruz
        System.out.print("Taban sayısını giriniz : ");
        int taban = input.nextInt();

        System.out.print("Üs sayısını giriniz : ");
        int us = input.nextInt();

        // Sonuç değişkenimizi tanımlıyoruz (başlangıç değeri 1)
        int sonuc = 1;

        // For döngüsü ile üs hesaplaması yapıyoruz
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println(taban + "^" + us + " = " + sonuc);
        System.out.println("=================================");
    }
}