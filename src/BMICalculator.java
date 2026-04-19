import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan boy ve kilo değerlerini alıyoruz
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double weight = input.nextDouble();

        // Vücut Kitle İndeksini hesaplıyoruz
        // Formül: Kilo (kg) / (Boy(m) * Boy(m))
        double bmi = weight / (height * height);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}