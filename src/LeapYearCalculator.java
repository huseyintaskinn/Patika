import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yıl bilgisini alıyoruz
        System.out.print("Yıl Giriniz : ");
        int yil = input.nextInt();

        String sonuc;

        // Artık yıl kontrolü yapıyoruz
        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
            sonuc = yil + " bir artık yıldır !";
        } else {
            sonuc = yil + " bir artık yıl değildir !";
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println(sonuc);
    }
}