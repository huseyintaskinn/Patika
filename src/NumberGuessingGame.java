import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(101); // 0-100 arası rastgele sayı

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("=================================");
        System.out.println("      SAYI TAHMİN OYUNU");
        System.out.println("=================================");
        System.out.println("0-100 arasında bir sayı tuttum.");
        System.out.println("5 hakkınız var. Haydi başlayalım!");
        System.out.println("=================================\n");

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            // Geçersiz giriş kontrolü (0-100 arası)
            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            // Doğru tahmin kontrolü
            if (selected == number) {
                System.out.println("\n=================================");
                System.out.println("Tebrikler, doğru tahmin!");
                System.out.println("Tahmin ettiğiniz sayı : " + number);
                System.out.println("=================================");
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz!");

                // İpucu verme
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan BÜYÜKTÜR.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan KÜÇÜKTÜR.");
                }

                wrong[right] = selected;
                right++;
                System.out.println("Kalan hakkınız : " + (5 - right));
                System.out.println("---------------------------------");
            }
        }

        // Oyun sonucu
        if (!isWin) {
            System.out.println("\n=================================");
            System.out.println("Üzgünüm! Kaybettiniz!");
            System.out.println("Tuttuğum sayı : " + number);
            System.out.println("---------------------------------");

            // Tahmin edilen yanlış sayıları göster
            if (wrong[0] != 0 || right > 0) {
                System.out.print("Tahminleriniz : ");
                for (int i = 0; i < right; i++) {
                    System.out.print(wrong[i]);
                    if (i < right - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
            System.out.println("=================================");
        }
    }
}