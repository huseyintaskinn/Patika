import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu alıyoruz
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        // Diziyi oluşturuyoruz
        int[] list = new int[n];

        // Kullanıcıdan dizi elemanlarını alıyoruz
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = input.nextInt();
        }

        // Diziyi sıralıyoruz (küçükten büyüğe)
        Arrays.sort(list);

        // Sıralanmış diziyi ekrana yazdırıyoruz
        System.out.print("Sıralama : ");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}