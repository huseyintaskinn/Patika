import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan elmasın yarı yüksekliğini alıyoruz
        System.out.print("Bir sayı giriniz (elmasın yarı yüksekliği) : ");
        int n = input.nextInt();

        System.out.println("\n=================================");
        System.out.println("Elmas Deseni:");
        System.out.println("---------------------------------");

        // Elmasın üst kısmı (piramit)
        for (int i = 1; i <= n; i++) {
            // Boşlukları yazdırıyoruz
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdırıyoruz
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Bir sonraki satıra geçiyoruz
            System.out.println();
        }

        // Elmasın alt kısmı (ters piramit)
        for (int i = n - 1; i >= 1; i--) {
            // Boşlukları yazdırıyoruz
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdırıyoruz
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Bir sonraki satıra geçiyoruz
            System.out.println();
        }

        System.out.println("=================================");
    }
}