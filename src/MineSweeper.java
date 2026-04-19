import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int row;
    private int col;
    private String[][] mineMap;
    private String[][] gameMap;
    private int mineCount;
    private int totalCells;
    private int openedCells;
    private boolean gameOver;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineMap = new String[row][col];
        this.gameMap = new String[row][col];
        this.totalCells = row * col;
        this.mineCount = totalCells / 4;
        this.openedCells = 0;
        this.gameOver = false;
    }

    public void run() {
        initializeMaps();
        placeMines();
        calculateNeighborMines();

        System.out.println("Mayınların Konumu");
        printMap(mineMap);
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        printMap(gameMap);

        playGame();
    }

    private void initializeMaps() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int placedMines = 0;

        while (placedMines < mineCount) {
            int randRow = rand.nextInt(row);
            int randCol = rand.nextInt(col);

            if (!mineMap[randRow][randCol].equals("*")) {
                mineMap[randRow][randCol] = "*";
                placedMines++;
            }
        }
    }

    private void calculateNeighborMines() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!mineMap[i][j].equals("*")) {
                    int count = countNeighborMines(i, j);
                    mineMap[i][j] = String.valueOf(count);
                }
            }
        }
    }

    private int countNeighborMines(int x, int y) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;

                int newX = x + i;
                int newY = y + j;

                if (newX >= 0 && newX < row && newY >= 0 && newY < col) {
                    if (mineMap[newX][newY].equals("*")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void playGame() {
        Scanner input = new Scanner(System.in);

        while (!gameOver) {
            System.out.print("Satır Giriniz : ");
            int selectedRow = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            int selectedCol = input.nextInt();

            if (selectedRow < 0 || selectedRow >= row || selectedCol < 0 || selectedCol >= col) {
                System.out.println("Geçersiz koordinat! Lütfen 0-" + (row-1) + " arasında satır ve 0-" + (col-1) + " arasında sütun giriniz.");
                continue;
            }

            if (!gameMap[selectedRow][selectedCol].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin!");
                continue;
            }

            if (mineMap[selectedRow][selectedCol].equals("*")) {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                gameOver = true;
                break;
            }

            // Mayın yoksa hücreyi aç (recursive)
            openCell(selectedRow, selectedCol);
            printMap(gameMap);

            // Kazanma kontrolü
            if (openedCells == totalCells - mineCount) {
                System.out.println("Oyunu Kazandınız !");
                printMap(mineMap);
                System.out.println("===========================");
                gameOver = true;
                break;
            }
        }
    }

    private void openCell(int x, int y) {
        // Sınır kontrolü
        if (x < 0 || x >= row || y < 0 || y >= col) {
            return;
        }

        // Daha önce açılmışsa veya mayınsa geri dön
        if (!gameMap[x][y].equals("-") || mineMap[x][y].equals("*")) {
            return;
        }

        // Hücreyi aç
        String cellValue = mineMap[x][y];
        gameMap[x][y] = cellValue;
        openedCells++;  // SADECE burda artırıyoruz, playGame'de değil!

        // Eğer hücre "0" ise etrafındaki tüm hücreleri de aç
        if (cellValue.equals("0")) {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) continue;
                    openCell(x + i, y + j);
                }
            }
        }
    }

    private void printMap(String[][] map) {
        System.out.println("===========================");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("      MAYIN TARLASI OYUNU");
        System.out.println("===========================");

        int row, col;

        while (true) {
            System.out.print("Satır sayısını giriniz (min 2): ");
            row = input.nextInt();
            System.out.print("Sütun sayısını giriniz (min 2): ");
            col = input.nextInt();

            if (row >= 2 && col >= 2) {
                break;
            } else {
                System.out.println("Hata: Minimum 2x2 boyutunda matris girişi yapmalısınız!");
            }
        }

        MineSweeper game = new MineSweeper(row, col);
        game.run();
    }
}