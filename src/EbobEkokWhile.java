import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan iki sayı alıyoruz
        System.out.print("Birinci sayıyı giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        int sayi2 = input.nextInt();

        // Orijinal sayıları saklıyoruz (EKOK için)
        int orijinalSayi1 = sayi1;
        int orijinalSayi2 = sayi2;

        // EBOB hesaplama (while döngüsü ile - Öklid algoritması)
        int ebob = 1;
        int bolen = 1;

        System.out.println("\n=================================");
        System.out.println("EBOB Hesaplama Adımları:");
        System.out.println("---------------------------------");

        // Küçük sayıya kadar olan bölenleri kontrol ediyoruz
        int kucukSayi = (sayi1 < sayi2) ? sayi1 : sayi2;

        while (bolen <= kucukSayi) {
            if (sayi1 % bolen == 0 && sayi2 % bolen == 0) {
                ebob = bolen;
                System.out.println(sayi1 + " ve " + sayi2 + " sayılarının ortak böleni : " + bolen);
            }
            bolen++;
        }

        // EKOK hesaplama (while döngüsü ile)
        // Formül: EKOK = (sayi1 * sayi2) / EBOB
        int ekok = (orijinalSayi1 * orijinalSayi2) / ebob;

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("---------------------------------");
        System.out.println("Girilen sayılar : " + orijinalSayi1 + " ve " + orijinalSayi2);
        System.out.println("EBOB(" + orijinalSayi1 + "," + orijinalSayi2 + ") = " + ebob);
        System.out.println("EKOK(" + orijinalSayi1 + "," + orijinalSayi2 + ") = " + ekok);
        System.out.println("=================================");
    }
}