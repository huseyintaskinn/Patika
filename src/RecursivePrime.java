import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Recursive ile Asal Sayı Kontrolü");
        System.out.println("=================================");

        // Kullanıcıdan sayıyı alıyoruz
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();

        System.out.println("\n=================================");

        // Asal sayı kontrolü yapıyoruz
        if (isAsal(sayi)) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }

        System.out.println("=================================");
    }

    // Recursive asal sayı kontrol metodu
    public static boolean isAsal(int sayi) {
        // 1 asal değildir
        if (sayi <= 1) {
            return false;
        }
        // Recursive kontrol için yardımcı metodu çağırıyoruz
        return asalKontrol(sayi, 2);
    }

    // Recursive yardımcı metot
    public static boolean asalKontrol(int sayi, int bolen) {
        // Tüm bölenleri kontrol ettik, asal
        if (bolen > Math.sqrt(sayi)) {
            return true;
        }

        // Eğer bölen bulunduysa asal değil
        if (sayi % bolen == 0) {
            return false;
        }

        // Bir sonraki bölen ile kontrol et
        return asalKontrol(sayi, bolen + 1);
    }
}