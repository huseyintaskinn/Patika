import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayıyı alıyoruz
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();

        // Harmonik seri toplamını hesaplıyoruz
        double toplam = 0.0;

        // For döngüsü ile harmonik seriyi hesaplıyoruz
        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println("Girilen sayı : " + n);
        System.out.println("Harmonik seri toplamı : " + toplam);
        System.out.println("=================================");
    }
}