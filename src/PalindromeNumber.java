import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayıyı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        // Orijinal sayıyı saklıyoruz
        int orijinalSayi = sayi;
        int tersSayi = 0;
        int geciciSayi = sayi;

        // Sayının tersini hesaplıyoruz
        while (geciciSayi != 0) {
            int basamak = geciciSayi % 10;           // Son basamağı alıyoruz
            tersSayi = tersSayi * 10 + basamak;      // Ters sayıyı oluşturuyoruz
            geciciSayi /= 10;                        // Son basamağı atıyoruz
        }

        // Palindrom kontrolü yapıyoruz
        System.out.println("\n=================================");
        if (orijinalSayi == tersSayi) {
            System.out.println(orijinalSayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(orijinalSayi + " bir palindrom sayı değildir.");
        }
        System.out.println("=================================");
    }
}