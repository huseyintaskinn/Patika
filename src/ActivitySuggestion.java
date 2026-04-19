import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz (°C) : ");
        double sicaklik = input.nextDouble();

        // Sıcaklığı aralıklara dönüştürüyoruz
        int aralik;

        if (sicaklik < 5) {
            aralik = 1;
        } else if (sicaklik >= 5 && sicaklik < 15) {
            aralik = 2;
        } else if (sicaklik >= 15 && sicaklik < 25) {
            aralik = 3;
        } else {
            aralik = 4;
        }

        // Switch-case ile etkinliği belirliyoruz
        String etkinlik;
        switch (aralik) {
            case 1:
                etkinlik = "Kayak";
                break;
            case 2:
                etkinlik = "Sinema";
                break;
            case 3:
                etkinlik = "Piknik";
                break;
            case 4:
                etkinlik = "Yüzme";
                break;
            default:
                etkinlik = "Tanımsız";
        }

        System.out.println("\n=================================");
        System.out.println("Önerilen etkinlik: " + etkinlik);
        System.out.println("=================================");
    }
}