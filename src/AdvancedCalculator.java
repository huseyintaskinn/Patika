import java.util.Scanner;

public class AdvancedCalculator {

    // Toplama işlemi
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("Toplama işlemi için sayıları giriniz. (Çıkmak için 0 giriniz)");
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    // Çıkarma işlemi
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    // Çarpma işlemi
    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.println("Çarpma işlemi için sayıları giriniz. (Çıkmak için 1 giriniz)");

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    // Bölme işlemi
    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    // Üslü sayı hesaplama
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    // Faktoriyel hesaplama
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        if (n < 0) {
            System.out.println("Negatif sayıların faktoriyeli hesaplanamaz!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(n + "! = " + result);
    }

    // Mod alma işlemi
    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz : ");
        int sayi = scan.nextInt();
        System.out.print("Mod değerini giriniz : ");
        int mod = scan.nextInt();

        if (mod == 0) {
            System.out.println("Mod değeri 0 olamaz!");
            return;
        }

        int sonuc = sayi % mod;
        System.out.println(sayi + " % " + mod + " = " + sonuc);
    }

    // Dikdörtgen alan ve çevre hesabı
    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarını giriniz : ");
        double kisaKenar = scan.nextDouble();
        System.out.print("Dikdörtgenin uzun kenarını giriniz : ");
        double uzunKenar = scan.nextDouble();

        if (kisaKenar <= 0 || uzunKenar <= 0) {
            System.out.println("Kenar uzunlukları pozitif sayı olmalıdır!");
            return;
        }

        double alan = kisaKenar * uzunKenar;
        double cevre = 2 * (kisaKenar + uzunKenar);

        System.out.println("\n=================================");
        System.out.println("Dikdörtgenin Alanı : " + alan);
        System.out.println("Dikdörtgenin Çevresi : " + cevre);
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "\n=================================\n"
                + "********** GELİŞMİŞ HESAP MAKİNESİ **********\n"
                + "=================================\n"
                + "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n"
                + "=================================";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor. Tekrar görüşmek üzere!");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, lütfen 0-8 arasında bir sayı giriniz.");
            }
        } while (select != 0);
    }
}