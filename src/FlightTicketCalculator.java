import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit değerleri tanımlıyoruz
        final double BIRIM_FIYAT = 0.10; // km başına 0.10 TL

        // Kullanıcıdan bilgileri alıyoruz
        System.out.print("Mesafeyi km türünden giriniz : ");
        double mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = input.nextInt();

        // Geçerlilik kontrolü yapıyoruz
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            // Normal tutarı hesaplıyoruz
            double normalTutar = mesafe * BIRIM_FIYAT;

            // Yaş indirim oranını belirliyoruz
            double yasIndirimOrani = 0;

            if (yas < 12) {
                yasIndirimOrani = 0.50; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimOrani = 0.10; // %10 indirim
            } else if (yas > 65) {
                yasIndirimOrani = 0.30; // %30 indirim
            }

            // Yaş indirimini hesaplıyoruz
            double yasIndirimi = normalTutar * yasIndirimOrani;
            double indirimliTutar = normalTutar - yasIndirimi;

            // Yolculuk tipine göre işlem yapıyoruz
            double toplamTutar;

            if (yolculukTipi == 2) {
                // Gidiş-dönüş için %20 indirim uyguluyoruz
                double gidisDonusIndirimi = indirimliTutar * 0.20;
                double tekYonIndirimli = indirimliTutar - gidisDonusIndirimi;
                toplamTutar = tekYonIndirimli * 2; // Gidiş ve dönüş olarak 2 ile çarpıyoruz
            } else {
                // Tek yön için indirim uygulamıyoruz
                toplamTutar = indirimliTutar;
            }

            // Sonucu ekrana yazdırıyoruz
            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }
    }
}