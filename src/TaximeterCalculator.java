import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit değerler
        final double OPENING_FEE = 10.0;
        final double PRICE_PER_KM = 2.20;
        final double MINIMUM_PRICE = 20.0;

        // Kullanıcıdan gidilen mesafeyi alıyoruz
        System.out.print("Gidilen mesafeyi (KM) giriniz: ");
        double distance = input.nextDouble();

        // Taksimetre tutarını hesaplıyoruz
        double totalPrice = OPENING_FEE + (distance * PRICE_PER_KM);

        // Minimum tutar kontrolünü yapıyoruz
        double finalPrice = Math.max(totalPrice, MINIMUM_PRICE);

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println("Açılış Ücreti: " + OPENING_FEE + " TL");
        System.out.println("KM Başına Ücret: " + PRICE_PER_KM + " TL");
        System.out.println("Gidilen Mesafe: " + distance + " KM");
        System.out.println("Hesaplanan Tutar: " + totalPrice + " TL");
        System.out.println("Minimum Ödenecek Tutar: " + MINIMUM_PRICE + " TL");
        System.out.println("---------------------------------");
        System.out.println("Ödenecek Tutar: " + finalPrice + " TL");
        System.out.println("=================================");
    }
}