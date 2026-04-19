import java.util.Scanner;

public class CourseAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ders isimlerimizi tanımlıyoruz
        String matematik = "Matematik";
        String fizik = "Fizik";
        String turkce = "Türkçe";
        String kimya = "Kimya";
        String muzik = "Müzik";

        // Geçme notunu tanımlıyoruz
        final int GECME_NOTU = 55;

        // Not değişkenlerimizi tanımlıyoruz
        double matNot, fizNot, turNot, kimNot, muzNot;

        // Geçerli ders sayısını ve toplam notu tutacak değişkenler
        double toplamNot = 0;
        int gecerliDersSayisi = 0;

        // Kullanıcıdan ders notlarını alıyoruz
        System.out.print(matematik + " notunuzu giriniz (0-100 arası): ");
        matNot = input.nextDouble();

        System.out.print(fizik + " notunuzu giriniz (0-100 arası): ");
        fizNot = input.nextDouble();

        System.out.print(turkce + " notunuzu giriniz (0-100 arası): ");
        turNot = input.nextDouble();

        System.out.print(kimya + " notunuzu giriniz (0-100 arası): ");
        kimNot = input.nextDouble();

        System.out.print(muzik + " notunuzu giriniz (0-100 arası): ");
        muzNot = input.nextDouble();

        System.out.println("\n=================================");

        // Matematik notu kontrolü yapıyoruz
        if (matNot >= 0 && matNot <= 100) {
            toplamNot += matNot;
            gecerliDersSayisi++;
            System.out.println(matematik + " : " + matNot + " (ortalamaya eklendi)");
        } else {
            System.out.println(matematik + " : " + matNot + " (geçersiz not, ortalamaya eklenmedi)");
        }

        // Fizik notu kontrolü yapıyoruz
        if (fizNot >= 0 && fizNot <= 100) {
            toplamNot += fizNot;
            gecerliDersSayisi++;
            System.out.println(fizik + " : " + fizNot + " (ortalamaya eklendi)");
        } else {
            System.out.println(fizik + " : " + fizNot + " (geçersiz not, ortalamaya eklenmedi)");
        }

        // Türkçe notu kontrolü yapıyoruz
        if (turNot >= 0 && turNot <= 100) {
            toplamNot += turNot;
            gecerliDersSayisi++;
            System.out.println(turkce + " : " + turNot + " (ortalamaya eklendi)");
        } else {
            System.out.println(turkce + " : " + turNot + " (geçersiz not, ortalamaya eklenmedi)");
        }

        // Kimya notu kontrolü yapıyoruz
        if (kimNot >= 0 && kimNot <= 100) {
            toplamNot += kimNot;
            gecerliDersSayisi++;
            System.out.println(kimya + " : " + kimNot + " (ortalamaya eklendi)");
        } else {
            System.out.println(kimya + " : " + kimNot + " (geçersiz not, ortalamaya eklenmedi)");
        }

        // Müzik notu kontrolü yapıyoruz
        if (muzNot >= 0 && muzNot <= 100) {
            toplamNot += muzNot;
            gecerliDersSayisi++;
            System.out.println(muzik + " : " + muzNot + " (ortalamaya eklendi)");
        } else {
            System.out.println(muzik + " : " + muzNot + " (geçersiz not, ortalamaya eklenmedi)");
        }

        System.out.println("---------------------------------");
        System.out.println("Geçerli ders sayısı: " + gecerliDersSayisi);

        // Ortalama hesaplıyoruz (geçerli ders varsa)
        if (gecerliDersSayisi > 0) {
            double ortalama = toplamNot / gecerliDersSayisi;
            System.out.println("Not ortalamanız: " + ortalama);

            // Geçme/kalma durumunu kontrol ediyoruz
            if (ortalama >= GECME_NOTU) {
                System.out.println("Sınıfı GEÇTİNİZ! Tebrikler!");
            } else {
                System.out.println("Sınıfta KALDINIZ! Üzülmeyin, daha iyi çalışın!");
            }
        } else {
            System.out.println("Hiç geçerli not girilmedi. Ortalama hesaplanamıyor.");
        }

        System.out.println("=================================");
    }
}