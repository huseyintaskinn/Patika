public class Employee {
    // Nitelikler (Attributes)
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu metot (Constructor)
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    // Bonus hesaplama metodu (fazla mesai)
    public double bonus() {
        if (this.workHours > 40) {
            int extraHours = this.workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışı hesaplama metodu
    public double raiseSalary() {
        int currentYear = 2021;
        int workYear = currentYear - this.hireYear;

        if (workYear < 10) {
            return this.salary * 0.05;
        } else if (workYear < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    // toString metodu (çalışan bilgilerini ekrana basar)
    public String toString() {
        double vergi = tax();
        double bonus = bonus();
        double maasArtisi = raiseSalary();
        double vergiVeBonusIleMaas = this.salary - vergi + bonus;
        double toplamMaas = this.salary + bonus + maasArtisi;

        return "=================================\n" +
                "ÇALIŞAN BİLGİLERİ\n" +
                "=================================\n" +
                "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "---------------------------------\n" +
                "Vergi : " + vergi + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + maasArtisi + "\n" +
                "---------------------------------\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - vergi + bonus) + "\n" +
                "Toplam Maaş : " + (this.salary + bonus + maasArtisi) + "\n" +
                "=================================";
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        // Örnek çalışan oluşturuyoruz
        Employee kemal = new Employee("Kemal", 2000.0, 45, 1985);

        // Çalışan bilgilerini ekrana yazdırıyoruz
        System.out.println(kemal.toString());

        System.out.println("\n"); // Boş satır

        // Farklı senaryolar için test çalışanları
        Employee ali = new Employee("Ali", 800.0, 40, 2015);
        System.out.println(ali.toString());

        System.out.println("\n");

        Employee ayse = new Employee("Ayşe", 3000.0, 50, 2000);
        System.out.println(ayse.toString());

        System.out.println("\n");

        Employee mehmet = new Employee("Mehmet", 1500.0, 38, 2018);
        System.out.println(mehmet.toString());
    }
}