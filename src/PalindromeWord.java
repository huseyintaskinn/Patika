import java.util.Scanner;

public class PalindromeWord {

    // Palindrom kontrolü yapan metot
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      PALİNDROM KELİME BULMA");
        System.out.println("=================================");

        System.out.print("Bir kelime giriniz: ");
        String word = input.nextLine();

        boolean result = isPalindrome(word);

        System.out.println("\n=================================");
        System.out.println("Girilen kelime: " + word);
        System.out.println("Kelimenin tersi: " + new StringBuilder(word).reverse().toString());
        System.out.println("---------------------------------");

        if (result) {
            System.out.println("✅ \"" + word + "\" bir PALİNDROM kelimedir!");
        } else {
            System.out.println("❌ \"" + word + "\" bir PALİNDROM kelime DEĞİLDİR!");
        }
        System.out.println("=================================");
    }
}

