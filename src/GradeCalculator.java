import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ders notlarını kullanıcıdan alıyoruz
        System.out.print("Matematik notunuzu giriniz: ");
        double math = input.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        double physics = input.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        double chemistry = input.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        double turkish = input.nextDouble();

        System.out.print("Tarih notunuzu giriniz: ");
        double history = input.nextDouble();

        System.out.print("Müzik notunuzu giriniz: ");
        double music = input.nextDouble();

        // Ortalamayı hesaplıyoruz
        double average = (math + physics + chemistry + turkish + history + music) / 6;

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("\n=================================");
        System.out.println("Ortalamanız: " + average);

        // Ternary operator ile sınıf geçme/kalma durumunu ekrana yazdırıyoruz
        String result = (average > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Sonuç: " + result);
        System.out.println("\n=================================");
    }
}
