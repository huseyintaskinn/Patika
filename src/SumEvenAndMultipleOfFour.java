import java.util.Scanner;

public class SumEvenAndMultipleOfFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Toplam değişkenimizi tanımlıyoruz
        int toplam = 0;

        System.out.println("Programdan çıkmak için tek bir sayı giriniz.");
        System.out.println("==================================================");

        // Sonsuz döngü oluşturuyoruz
        while (true) {
            System.out.print("Bir sayı giriniz : ");
            int sayi = input.nextInt();

            // Girilen sayı tek mi kontrol ediyoruz
            if (sayi % 2 != 0) {
                System.out.println("Tek sayı girdiniz. Program sonlanıyor...");
                break; // Döngüden çıkıyoruz
            }

            // Çift sayılar için 4'ün katı mı kontrol ediyoruz
            if (sayi % 4 == 0) {
                toplam += sayi;
                System.out.println(sayi + " sayısı çift ve 4'ün katı. Toplama eklendi.");
            } else {
                System.out.println(sayi + " sayısı çift ama 4'ün katı değil. Toplanmayacak.");
            }
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı : " + toplam);
        System.out.println("=================================");
    }
}