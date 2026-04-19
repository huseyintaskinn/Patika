import java.util.Scanner;

public class PowersOfFourAndFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sınır değerini alıyoruz
        System.out.print("Bir sayı giriniz : ");
        int sinir = input.nextInt();

        System.out.println("\n=================================");
        System.out.println("Girilen sayı : " + sinir);
        System.out.println("---------------------------------");

        // 4'ün kuvvetlerini buluyoruz
        System.out.println("4'ün kuvvetleri :");
        for (int i = 1; i <= sinir; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println("\n---------------------------------");

        // 5'in kuvvetlerini buluyoruz
        System.out.println("5'in kuvvetleri :");
        for (int i = 1; i <= sinir; i *= 5) {
            System.out.print(i + " ");
        }

        System.out.println("\n=================================");
    }
}