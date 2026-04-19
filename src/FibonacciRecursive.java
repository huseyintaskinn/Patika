import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan eleman sayısını alıyoruz
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = input.nextInt();

        System.out.println("\n=================================");
        System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisi (Recursive):");
        System.out.println("---------------------------------");

        // Fibonacci serisini ekrana yazdırıyoruz
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n=================================");
    }

    // Recursive fibonacci hesaplayan metot
    public static int fibonacci(int n) {
        // Temel durumlar (base case)
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive durum: fib(n) = fib(n-1) + fib(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}