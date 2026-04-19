public class HarmonicMean {
    public static void main(String[] args) {
        // Örnek dizi
        int[] numbers = {1, 2, 3, 4, 5};

        // Harmonik seriyi hesaplıyoruz (1/eleman)
        double harmonicSum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / numbers[i];
        }

        // Harmonik ortalama = eleman sayısı / harmonik seri toplamı
        double harmonicAverage = numbers.length / harmonicSum;

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("=================================");
        System.out.print("Dizi elemanları: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n---------------------------------");
        System.out.println("Harmonik Seri Toplamı: " + harmonicSum);
        System.out.println("Eleman Sayısı: " + numbers.length);
        System.out.println("---------------------------------");
        System.out.println("Harmonik Ortalama: " + harmonicAverage);
        System.out.println("=================================");
    }
}