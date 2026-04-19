import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını alıyoruz
        System.out.print("Basamak Sayısı : ");
        int basamak = input.nextInt();

        System.out.println("\n=================================");
        System.out.println(basamak + " basamaklı ters üçgen:");
        System.out.println("---------------------------------");

        // Ters üçgen çizimi
        for (int i = basamak; i >= 1; i--) {
            // Yıldızları yazdırıyoruz (2*i - 1 tane yıldız)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Bir sonraki satıra geçiyoruz
            System.out.println();
        }

        System.out.println("=================================");
    }
}