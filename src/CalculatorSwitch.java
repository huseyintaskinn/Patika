import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenlerimizi tanımlıyoruz
        int n1, n2, select;

        // Kullanıcıdan sayıları alıyoruz
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        // Menüyü gösteriyoruz
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        // Switch-case ile işlemleri yapıyoruz
        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                // Bölme işleminde sıfır kontrolü yapıyoruz
                if (n2 != 0) {
                    System.out.println("Bölme : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez !");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }
    }
}