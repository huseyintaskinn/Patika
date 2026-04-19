import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan 3 sayı alıyoruz
        System.out.print("Birinci sayıyı giriniz : ");
        double sayi1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz : ");
        double sayi2 = input.nextDouble();

        System.out.print("Üçüncü sayıyı giriniz : ");
        double sayi3 = input.nextDouble();

        // Sayıları karşılaştırıp sıralıyoruz
        double enKucuk, orta, enBuyuk;

        // Tüm durumları kontrol ediyoruz
        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            // sayi1 en küçük
            enKucuk = sayi1;
            if (sayi2 <= sayi3) {
                orta = sayi2;
                enBuyuk = sayi3;
            } else {
                orta = sayi3;
                enBuyuk = sayi2;
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            // sayi2 en küçük
            enKucuk = sayi2;
            if (sayi1 <= sayi3) {
                orta = sayi1;
                enBuyuk = sayi3;
            } else {
                orta = sayi3;
                enBuyuk = sayi1;
            }
        } else {
            // sayi3 en küçük
            enKucuk = sayi3;
            if (sayi1 <= sayi2) {
                orta = sayi1;
                enBuyuk = sayi2;
            } else {
                orta = sayi2;
                enBuyuk = sayi1;
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println("Girilen sayıların küçükten büyüğe sıralanışı:");
        System.out.println(enKucuk + " < " + orta + " < " + enBuyuk);
        System.out.println("=================================");
    }
}