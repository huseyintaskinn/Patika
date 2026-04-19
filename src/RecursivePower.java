import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Recursive ile Üslü Sayı Hesaplama");
        System.out.println("=================================");

        // Kullanıcıdan taban ve üs değerlerini alıyoruz
        System.out.print("Taban değeri giriniz : ");
        int taban = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int us = input.nextInt();

        // Recursive metodu çağırıyoruz
        int sonuc = usAlma(taban, us);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println(taban + "^" + us + " = " + sonuc);
        System.out.println("=================================");
    }

    // Recursive üs alma metodu
    public static int usAlma(int taban, int us) {
        // Temel durum: üs 0 ise sonuç 1'dir
        if (us == 0) {
            return 1;
        }

        // Üs pozitif ise recursive çağrı yapıyoruz
        // taban^üs = taban * taban^(üs-1)
        return taban * usAlma(taban, us - 1);
    }
}