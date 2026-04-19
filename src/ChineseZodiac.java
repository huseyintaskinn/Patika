import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan doğum yılını alıyoruz
        System.out.print("Doğum Yılınızı Giriniz : ");
        int dogumYili = input.nextInt();

        // Doğum yılının 12 ile bölümünden kalanı hesaplıyoruz
        int kalan = dogumYili % 12;

        // Kalana göre burcu belirliyoruz
        String burc;

        switch (kalan) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                burc = "Geçersiz değer";
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Çin Zodyağı Burcunuz : " + burc);
    }
}