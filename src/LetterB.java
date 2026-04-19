public class LetterB {
    public static void main(String[] args) {
        // 7 satır, 5 sütun
        String[][] b = new String[7][5];

        // B harfi desenini oluşturuyoruz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                // Sol kenar (her zaman dolu)
                if (j == 0) {
                    b[i][j] = " * ";
                }
                // Üst yatay çizgi (1. satır)
                else if (i == 0 && (j == 1 || j == 2 || j == 3)) {
                    b[i][j] = " * ";
                }
                // Orta yatay çizgi (4. satır - index 3)
                else if (i == 3 && (j == 1 || j == 2 || j == 3)) {
                    b[i][j] = " * ";
                }
                // Alt yatay çizgi (7. satır - index 6)
                else if (i == 6 && (j == 1 || j == 2 || j == 3)) {
                    b[i][j] = " * ";
                }
                // Sağ kenar (üst ve alt kısımlar için)
                else if (j == 4 && (i == 1 || i == 2 || i == 4 || i == 5)) {
                    b[i][j] = " * ";
                }
                // Boşluklar
                else {
                    b[i][j] = "   ";
                }
            }
        }

        // Sonucu yazdırıyoruz
        System.out.println("=================================");
        System.out.println("Çok Boyutlu Dizi ile B Harfi:");
        System.out.println("---------------------------------");

        for (String[] row : b) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println("=================================");
    }
}