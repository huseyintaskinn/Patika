import java.util.Arrays;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Örnek dizi
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        // Daha önce kontrol edilen sayıları saklamak için dizi
        int[] checked = new int[list.length];
        int checkedIndex = 0;

        System.out.println("=================================");
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("---------------------------------");
        System.out.println("Tekrar Sayıları");
        System.out.println("---------------------------------");

        // Dizideki her bir elemanı kontrol ediyoruz
        for (int i = 0; i < list.length; i++) {
            int currentNumber = list[i];
            boolean alreadyChecked = false;

            // Bu sayı daha önce kontrol edildi mi?
            for (int j = 0; j < checkedIndex; j++) {
                if (checked[j] == currentNumber) {
                    alreadyChecked = true;
                    break;
                }
            }

            // Daha önce kontrol edilmemişse frekansını hesapla
            if (!alreadyChecked) {
                int count = 0;
                for (int j = 0; j < list.length; j++) {
                    if (list[j] == currentNumber) {
                        count++;
                    }
                }
                System.out.println(currentNumber + " sayısı " + count + " kere tekrar edildi.");
                checked[checkedIndex] = currentNumber;
                checkedIndex++;
            }
        }

        System.out.println("=================================");
    }
}