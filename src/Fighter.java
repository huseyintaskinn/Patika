public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  // 0.0 to 99.9
        return randomValue <= this.dodge;
    }
}

class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    boolean f1Starts;  // İlk kimin başlayacağını belirten değişken

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

        // %50 olasılık ile ilk başlayacak dövüşçüyü belirliyoruz
        this.f1Starts = Math.random() < 0.5;
    }

    public void run() {
        if (checkWeight()) {
            // İlk başlayacak dövüşçüyü ekrana yazdırıyoruz
            System.out.println("=================================");
            System.out.println("MAÇ BAŞLIYOR!");
            if (f1Starts) {
                System.out.println("İlk olarak " + f1.name + " dövüşe başlıyor!");
            } else {
                System.out.println("İlk olarak " + f2.name + " dövüşe başlıyor!");
            }
            System.out.println("=================================\n");

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");

                if (f1Starts) {
                    // f1 başlıyor
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    // f2 başlıyor
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) &&
                (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("=================================");
            System.out.println("MAÇ SONUCU!");
            System.out.println("Maçı Kazanan : " + f2.name);
            System.out.println("=================================");
            return true;
        } else if (f2.health == 0) {
            System.out.println("=================================");
            System.out.println("MAÇ SONUCU!");
            System.out.println("Maçı Kazanan : " + f1.name);
            System.out.println("=================================");
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t: " + f1.health);
        System.out.println(f2.name + " Kalan Can \t: " + f2.health);
    }
}

class FighterMain {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 20);    // %20 blok şansı
        Fighter alex = new Fighter("Alex", 10, 95, 100, 30);   // %30 blok şansı
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}