import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan n ve r değerlerini alıyoruz
        System.out.print("n değerini giriniz (kümenin eleman sayısı) : ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz (oluşturulacak grup eleman sayısı) : ");
        int r = input.nextInt();

        // Geçerlilik kontrolü yapıyoruz
        if (n < 0 || r < 0 || r > n) {
            System.out.println("\n=================================");
            System.out.println("Hatalı giriş! n >= r >= 0 olmalıdır.");
            System.out.println("=================================");
        } else {
            // Faktöriyel hesaplamalarını yapıyoruz
            int nFaktoriyel = faktoriyel(n);
            int rFaktoriyel = faktoriyel(r);
            int nRfaktoriyel = faktoriyel(n - r);

            // Kombinasyonu hesaplıyoruz
            int kombinasyon = nFaktoriyel / (rFaktoriyel * nRfaktoriyel);

            // Sonucu ekrana yazdırıyoruz
            System.out.println("\n=================================");
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
            System.out.println("=================================");
        }
    }

    // Faktöriyel hesaplayan metodu oluşturuyoruz
    public static int faktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}