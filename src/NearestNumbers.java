import java.util.Arrays;

public class NearestNumbers {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilenSayi = 5;

        // Diziyi sıralıyoruz (isteğe bağlı, daha kolay karşılaştırma için)
        int[] sortedList = list.clone();
        Arrays.sort(sortedList);

        System.out.println("=================================");
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen Sayı : " + girilenSayi);
        System.out.println("---------------------------------");

        // Girilen sayıdan küçük en yakın sayıyı buluyoruz
        int kucukEnYakin = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < girilenSayi) {
                if (list[i] > kucukEnYakin) {
                    kucukEnYakin = list[i];
                }
            }
        }

        // Girilen sayıdan büyük en yakın sayıyı buluyoruz
        int buyukEnYakin = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > girilenSayi) {
                if (list[i] < buyukEnYakin) {
                    buyukEnYakin = list[i];
                }
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyukEnYakin);
        System.out.println("=================================");
    }
}