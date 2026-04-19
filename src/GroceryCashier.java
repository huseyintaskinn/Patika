import java.util.Scanner;

public class GroceryCashier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meyvelerin kg fiyatlarını tanımlıyoruz
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcıdan her ürün için kaç kilo aldığını alıyoruz
        System.out.print("Armut Kaç Kilo ? :");
        double armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlicanKilo = input.nextDouble();

        // Her ürünün tutarını hesaplıyoruz
        double armutTutar = armutFiyat * armutKilo;
        double elmaTutar = elmaFiyat * elmaKilo;
        double domatesTutar = domatesFiyat * domatesKilo;
        double muzTutar = muzFiyat * muzKilo;
        double patlicanTutar = patlicanFiyat * patlicanKilo;

        // Toplam tutarı hesaplıyoruz
        double toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}