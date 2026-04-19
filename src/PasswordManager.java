import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Doğru şifreyi tanımlıyoruz
        String dogruSifre = "java123";

        // Kullanıcıdan şifreyi alıyoruz
        System.out.print("Şifrenizi giriniz : ");
        String girilenSifre = input.nextLine();

        // Şifre doğru mu kontrol ediyoruz
        if (girilenSifre.equals(dogruSifre)) {
            System.out.println("Şifre doğru! Hoş geldiniz.");
        } else {
            // Şifre yanlış ise kullanıcıya sıfırlamak isteyip istemediğini soruyoruz
            System.out.print("Şifreniz yanlış! Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır) : ");
            String cevap = input.nextLine();

            // Kullanıcının cevabını kontrol ediyoruz (büyük-küçük harf duyarlılığını kaldırıyoruz)
            if (cevap.equalsIgnoreCase("Evet")) {
                // Yeni şifreyi alıyoruz
                System.out.print("Yeni şifrenizi giriniz : ");
                String yeniSifre = input.nextLine();

                // Yeni şifre ile eski şifreyi karşılaştırıyoruz
                if (yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu!");
                    dogruSifre = yeniSifre; // Yeni şifreyi kaydediyoruz (isteğe bağlı)
                }
            } else {
                System.out.println("Şifre sıfırlanmadı. Program sonlandırılıyor.");
            }
        }
    }
}