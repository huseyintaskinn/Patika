import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üç kenar uzunluğunu alıyoruz
        System.out.print("Birinci kenar uzunluğunu giriniz (a): ");
        double a = input.nextDouble();

        System.out.print("İkinci kenar uzunluğunu giriniz (b): ");
        double b = input.nextDouble();

        System.out.print("Üçüncü kenar uzunluğunu giriniz (c): ");
        double c = input.nextDouble();

        // Hipotenüsü hesaplıyoruz (dik üçgen varsayımıyla a ve b dik kenarlar)
        double hypotenuse = Math.sqrt((a * a) + (b * b));

        // Üçgenin çevresini ve alanını hesaplıyoruz (Heron formülü)
        double u = (a + b + c) / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println("Dik Kenar 1 (a): " + a);
        System.out.println("Dik Kenar 2 (b): " + b);
        System.out.println("Hipotenüs (c): " + hypotenuse);
        System.out.println("---------------------------------");
        System.out.println("Üçgenin Çevresi (2u): " + (2 * u));
        System.out.println("u (yarı çevre): " + u);
        System.out.println("Üçgenin Alanı: " + area);
        System.out.println("=================================");
    }
}