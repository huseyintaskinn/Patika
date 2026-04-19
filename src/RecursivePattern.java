import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Recursive ile Sayı Deseni Oluşturma");
        System.out.println("=================================");

        // Kullanıcıdan sayıyı alıyoruz
        System.out.print("N Sayısı : ");
        int n = input.nextInt();

        System.out.println("\n=================================");
        System.out.print("Çıktısı : ");

        // Recursive metodu çağırıyoruz
        desenOlustur(n, n, true);

        System.out.println("\n=================================");
    }

    // Recursive desen oluşturma metodu
    public static void desenOlustur(int orijinalSayi, int guncelSayi, boolean azaliyor) {
        // Sayıyı ekrana yazdırıyoruz
        System.out.print(guncelSayi + " ");

        // Temel durum: Orijinal sayıya geri döndüysek ve artış aşamasındaysak bitir
        if (guncelSayi == orijinalSayi && !azaliyor) {
            return;
        }

        // Azalma aşaması
        if (azaliyor) {
            int yeniSayi = guncelSayi - 5;

            // 0 veya negatif olduysa artışa geç
            if (yeniSayi <= 0) {
                desenOlustur(orijinalSayi, yeniSayi, false);
            } else {
                desenOlustur(orijinalSayi, yeniSayi, true);
            }
        }
        // Artış aşaması
        else {
            int yeniSayi = guncelSayi + 5;
            desenOlustur(orijinalSayi, yeniSayi, false);
        }
    }
}