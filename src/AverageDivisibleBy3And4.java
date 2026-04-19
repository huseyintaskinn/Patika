import java.util.Scanner;

public class AverageDivisibleBy3And4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayıyı alıyoruz
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        // Toplam ve sayac değişkenlerimizi tanımlıyoruz
        int toplam = 0;
        int adet = 0;

        // 0'dan girilen sayıya kadar döngü oluşturuyoruz
        for (int i = 0; i <= sayi; i++) {
            // 3 ve 4'e tam bölünme kontrolü yapıyoruz (yani 12'ye tam bölünme)
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;  // Sayıyı toplama ekliyoruz
                adet++;       // Adedi bir artırıyoruz
                System.out.println(i + " sayısı 3 ve 4'e tam bölünüyor.");
            }
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("\n=================================");
        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e tam bölünen " + adet + " adet sayı bulundu.");
            System.out.println("Bu sayıların toplamı: " + toplam);
            System.out.println("Ortalamaları: " + ortalama);
        } else {
            System.out.println("0 ile " + sayi + " arasında 3 ve 4'e tam bölünen sayı bulunamadı.");
        }
        System.out.println("=================================");
    }
}