import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kaç sayı gireceğini alıyoruz
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        // İlk sayıyı alıyoruz (başlangıç değeri olarak)
        System.out.print("1. Sayıyı giriniz: ");
        int sayi = input.nextInt();

        // En büyük ve en küçük değerleri ilk sayıya eşitliyoruz
        int enBuyuk = sayi;
        int enKucuk = sayi;

        // Kalan sayılar için döngü oluşturuyoruz
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();

            // En büyük kontrolü yapıyoruz
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            // En küçük kontrolü yapıyoruz
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println("Girilen " + n + " sayı içerisinde:");
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
        System.out.println("=================================");
    }
}