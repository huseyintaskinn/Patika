public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;      // Sınav notu (0-100)
    int oralNote;      // Sözlü notu (0-100)
    double oralEffect; // Sözlü notunun ortalamaya etki yüzdesi (0.0 - 1.0 arası)
    double examEffect; // Sınav notunun ortalamaya etki yüzdesi (0.0 - 1.0 arası)

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.oralNote = 0;
        this.oralEffect = 0.20;  // Varsayılan: sözlü %20 etki
        this.examEffect = 0.80;   // Varsayılan: sınav %80 etki
    }

    // Sözlü ve sınav etki oranlarını ayarlayan metot
    public void setEffects(double oralEffect, double examEffect) {
        this.oralEffect = oralEffect;
        this.examEffect = examEffect;
    }

    // Dersin genel notunu hesaplayan metot
    public double getTotalNote() {
        return (this.examNote * this.examEffect) + (this.oralNote * this.oralEffect);
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    // Sözlü notunu giren metot
    public void setOralNote(int oralNote) {
        if (oralNote >= 0 && oralNote <= 100) {
            this.oralNote = oralNote;
        } else {
            System.out.println(this.name + " dersi için geçersiz sözlü notu! (0-100 arası olmalı)");
        }
    }

    // Sınav notunu giren metot
    public void setExamNote(int examNote) {
        if (examNote >= 0 && examNote <= 100) {
            this.examNote = examNote;
        } else {
            System.out.println(this.name + " dersi için geçersiz sınav notu! (0-100 arası olmalı)");
        }
    }
}

class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0.0;
        this.isPass = false;
    }

    // Sınav notlarını ekleyen metot
    public void addBulkExamNote(int matExam, int fizikExam, int kimyaExam) {
        this.mat.setExamNote(matExam);
        this.fizik.setExamNote(fizikExam);
        this.kimya.setExamNote(kimyaExam);
    }

    // Sözlü notlarını ekleyen metot
    public void addBulkOralNote(int matOral, int fizikOral, int kimyaOral) {
        this.mat.setOralNote(matOral);
        this.fizik.setOralNote(fizikOral);
        this.kimya.setOralNote(kimyaOral);
    }

    // Ortalamayı hesaplayan metot
    public void calcAvarage() {
        double matTotal = this.mat.getTotalNote();
        double fizikTotal = this.fizik.getTotalNote();
        double kimyaTotal = this.kimya.getTotalNote();
        this.avarage = (matTotal + fizikTotal + kimyaTotal) / 3;
    }

    // Geçme kontrolü yapan metot
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    // Sınıf geçme durumunu yazdıran metot
    public void isPass() {
        if (this.mat.examNote == 0 || this.fizik.examNote == 0 || this.kimya.examNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş!");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + String.format("%.2f", this.avarage));
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    // Notları ekrana yazdıran metot
    public void printNote() {
        System.out.println("\n=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Öğrenci No : " + this.stuNo);
        System.out.println("Sınıf : " + this.classes);
        System.out.println("=========================");

        System.out.println("***** " + this.mat.name + " *****");
        System.out.println("  Sınav Notu : " + this.mat.examNote);
        System.out.println("  Sözlü Notu : " + this.mat.oralNote);
        System.out.println("  Ders Notu (Sınav %" + (int)(this.mat.examEffect * 100) + " + Sözlü %" + (int)(this.mat.oralEffect * 100) + ") : " + String.format("%.2f", this.mat.getTotalNote()));

        System.out.println("***** " + this.fizik.name + " *****");
        System.out.println("  Sınav Notu : " + this.fizik.examNote);
        System.out.println("  Sözlü Notu : " + this.fizik.oralNote);
        System.out.println("  Ders Notu (Sınav %" + (int)(this.fizik.examEffect * 100) + " + Sözlü %" + (int)(this.fizik.oralEffect * 100) + ") : " + String.format("%.2f", this.fizik.getTotalNote()));

        System.out.println("***** " + this.kimya.name + " *****");
        System.out.println("  Sınav Notu : " + this.kimya.examNote);
        System.out.println("  Sözlü Notu : " + this.kimya.oralNote);
        System.out.println("  Ders Notu (Sınav %" + (int)(this.kimya.examEffect * 100) + " + Sözlü %" + (int)(this.kimya.oralEffect * 100) + ") : " + String.format("%.2f", this.kimya.getTotalNote()));
    }
}

// Main.java
class Main {
    public static void main(String[] args) {

        // Dersleri oluşturuyoruz
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        // Her ders için sözlü ve sınav etki oranlarını ayarlıyoruz
        mat.setEffects(0.20, 0.80);   // Matematik: Sözlü %20, Sınav %80
        fizik.setEffects(0.30, 0.70); // Fizik: Sözlü %30, Sınav %70
        kimya.setEffects(0.15, 0.85); // Kimya: Sözlü %15, Sınav %85

        // Öğretmenleri oluşturuyoruz
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        // Öğretmenleri derslere atıyoruz
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        // Öğrenci 1: İnek Şaban
        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 60, 40);
        s1.addBulkOralNote(90, 80, 70);
        s1.isPass();

        // Öğrenci 2: Güdük Necmi
        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkOralNote(85, 75, 65);
        s2.isPass();

        // Öğrenci 3: Hayta İsmail
        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(70, 80, 90);
        s3.addBulkOralNote(60, 50, 40);
        s3.isPass();
    }
}