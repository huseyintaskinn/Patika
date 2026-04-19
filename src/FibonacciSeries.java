import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan eleman sayısını alıyoruz
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = input.nextInt();

        System.out.println("\n=================================");
        System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisi:");
        System.out.println("---------------------------------");

        // Fibonacci serisinin ilk iki elemanı
        int ilk = 0;
        int ikinci = 1;

        // Eleman sayısı kontrolü
        if (elemanSayisi >= 1) {
            System.out.print(ilk + " ");
        }

        if (elemanSayisi >= 2) {
            System.out.print(ikinci + " ");
        }

        // Kalan elemanları hesaplıyoruz
        for (int i = 3; i <= elemanSayisi; i++) {
            int sonraki = ilk + ikinci;
            System.out.print(sonraki + " ");
            ilk = ikinci;
            ikinci = sonraki;
        }

        System.out.println("\n=================================");
    }
}