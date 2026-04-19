import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayıyı alıyoruz
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();

        // Geçici değişkenlerimizi tanımlıyoruz
        int geciciSayi = sayi;
        int basamakToplami = 0;

        // Sayı 0 olana kadar döngü devam ediyor
        while (geciciSayi != 0) {
            // Son basamağı alıyoruz
            int basamak = geciciSayi % 10;
            // Basamağı toplama ekliyoruz
            basamakToplami += basamak;
            // Son basamağı atıyoruz
            geciciSayi /= 10;
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println("Girilen sayı : " + sayi);
        System.out.println("Basamak sayılarının toplamı : " + basamakToplami);
        System.out.println("=================================");
    }
}