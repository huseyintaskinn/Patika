import java.util.Scanner;

public class KDTCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        double amount = input.nextDouble();

        // Ternary operator ile KDV oranı belirliyoruz
        double kdvRate = (amount > 0 && amount <= 1000) ? 0.18 : 0.08;

        // Gerekli hesaplamaları yapıyoruz
        double kdvAmount = amount * kdvRate;
        double totalAmount = amount + kdvAmount;

        System.out.println("\n=================================");
        System.out.println("KDV'siz Tutar: " + amount);
        System.out.println("KDV Oranı: %" + (kdvRate * 100));
        System.out.println("KDV Tutarı: " + kdvAmount);
        System.out.println("KDV'li Tutar: " + totalAmount);
        System.out.println("=================================");

        input.close();
    }
}