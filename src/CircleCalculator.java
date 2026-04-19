import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit değerleri tanımlıyoruz
        final double PI = 3.14;

        // Kullanıcıdan yarıçap değerini alıyoruz
        System.out.print("Dairenin yarıçapını (r) giriniz: ");
        double r = input.nextDouble();

        // Dairenin alanını ve çevresini hesaplıyoruz
        double area = PI * r * r;
        double circumference = 2 * PI * r;

        // Kullanıcıdan merkez açı değerini almıyoruz
        System.out.print("Daire diliminin merkez açısını (α) giriniz: ");
        double alpha = input.nextDouble();

        // Daire diliminin alanını hesaplıyoruz
        double sliceArea = (PI * r * r * alpha) / 360;

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println("Yarıçap (r): " + r + " cm");
        System.out.println("π sayısı: " + PI);
        System.out.println("---------------------------------");
        System.out.println("Dairenin Alanı: " + area + " cm²");
        System.out.println("Dairenin Çevresi: " + circumference + " cm");
        System.out.println("---------------------------------");
        System.out.println("Merkez Açı (α): " + alpha + "°");
        System.out.println("Daire Diliminin Alanı: " + sliceArea + " cm²");
        System.out.println("=================================");
    }
}