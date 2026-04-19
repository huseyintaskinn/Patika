import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateEvenNumbers {
    public static void main(String[] args) {
        // Örnek dizi
        int[] numbers = {2, 4, 6, 8, 2, 4, 10, 12, 14, 6, 16, 18, 20, 2, 8, 10, 22, 24, 4};

        // Tekrar eden çift sayıları saklamak için ArrayList
        ArrayList<Integer> duplicates = new ArrayList<>();

        // Daha önce kontrol edilen sayıları saklamak için
        ArrayList<Integer> checkedNumbers = new ArrayList<>();

        System.out.println("=================================");
        System.out.println("Dizi: " + Arrays.toString(numbers));
        System.out.println("---------------------------------");

        // Dizideki her bir elemanı kontrol ediyoruz
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            // Sadece çift sayıları kontrol ediyoruz
            if (currentNumber % 2 == 0) {
                // Bu sayı daha önce kontrol edildi mi?
                if (!checkedNumbers.contains(currentNumber)) {
                    // Sayının dizide tekrar edip etmediğini kontrol ediyoruz
                    int count = 0;
                    for (int j = 0; j < numbers.length; j++) {
                        if (numbers[j] == currentNumber) {
                            count++;
                        }
                    }

                    // Eğer 1'den fazla varsa tekrar ediyordur
                    if (count > 1) {
                        duplicates.add(currentNumber);
                        System.out.println(currentNumber + " sayısı " + count + " kez tekrar ediyor.");
                    }

                    // Bu sayıyı kontrol edildi olarak işaretliyoruz
                    checkedNumbers.add(currentNumber);
                }
            }
        }

        System.out.println("---------------------------------");

        // Sonuçları ekrana yazdırıyoruz
        if (duplicates.isEmpty()) {
            System.out.println("Dizide tekrar eden çift sayı bulunamadı.");
        } else {
            System.out.print("Tekrar eden çift sayılar: ");
            for (int i = 0; i < duplicates.size(); i++) {
                System.out.print(duplicates.get(i));
                if (i < duplicates.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        System.out.println("=================================");
    }
}