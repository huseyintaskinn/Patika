import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz (1-12 arası) : ");
        int ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz : ");
        int gun = input.nextInt();

        String burc = "";
        boolean gecerli = true;

        // Ay ve gün kontrolü yapıyoruz
        if (ay < 1 || ay > 12) {
            burc = "Geçersiz ay!";
            gecerli = false;
        } else if (gun < 1 || gun > 31) {
            burc = "Geçersiz gün!";
            gecerli = false;
        } else if ((ay == 4 || ay == 6 || ay == 9 || ay == 11) && gun > 30) {
            burc = "Bu ayda 30 gün vardır!";
            gecerli = false;
        } else if (ay == 2 && gun > 29) {
            burc = "Şubat ayında en fazla 29 gün vardır!";
            gecerli = false;
        } else {
            // Burç hesaplama
            if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
                burc = "Koç";
            } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
                burc = "Boğa";
            } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
                burc = "İkizler";
            } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
                burc = "Yengeç";
            } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
                burc = "Aslan";
            } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
                burc = "Başak";
            } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
                burc = "Terazi";
            } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
                burc = "Akrep";
            } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
                burc = "Yay";
            } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
                burc = "Oğlak";
            } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
                burc = "Kova";
            } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
                burc = "Balık";
            }
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("\n=================================");
        if (gecerli) {
            System.out.println("Doğum tarihi: " + gun + "/" + ay);
            System.out.println("Burcunuz: " + burc);
        } else {
            System.out.println("Hata: " + burc);
        }
        System.out.println("=================================");
    }
}