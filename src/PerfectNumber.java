import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayıyı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        // Bölenlerin toplamını tutacak değişken
        int bolenlerToplami = 0;

        // Sayının kendisi hariç bölenlerini buluyoruz
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                bolenlerToplami += i;
            }
        }

        // Mükemmel sayı kontrolü yapıyoruz
        System.out.println("\n=================================");
        if (bolenlerToplami == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
        System.out.println("=================================");
    }
}