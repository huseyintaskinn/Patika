public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("1 - 100 arasındaki asal sayılar:");
        System.out.println("---------------------------------");

        // 1'den 100'e kadar olan sayıları kontrol ediyoruz
        for (int i = 2; i <= 100; i++) {
            boolean asal = true;

            // Sayının asal olup olmadığını kontrol ediyoruz
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break; // Bölen bulundu, döngüden çıkıyoruz
                }
            }

            // Asal ise ekrana yazdırıyoruz
            if (asal) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n=================================");
    }
}