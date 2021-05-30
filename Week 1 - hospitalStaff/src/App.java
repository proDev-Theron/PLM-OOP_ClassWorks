/*
Bueno, Theron Adrianne A.
Block 3 - OOP

Week 1 - Laboratory Exercise
Write a Java program that demonstrates the use of Objects and Classes
*/
class App {
    public static void main(String[] args) throws Exception {

        Doctors generalSurgeon = new Doctors();
        Doctors cardiothoracicSurgeon = new Doctors();
        Doctors chiefSurgeon = new Doctors();

        generalSurgeon.name = "Kang Dong-Ju";
        generalSurgeon.title = "General Surgeon";
        generalSurgeon.age = 37;
        generalSurgeon.height = 183.1;
        generalSurgeon.birthDate = "April 11, 1984";

        cardiothoracicSurgeon.name = "Yoon Seo-Jeong";
        cardiothoracicSurgeon.title = "Cardiothoracic Surgeon";
        cardiothoracicSurgeon.age = 36;
        cardiothoracicSurgeon.height = 167.5;
        cardiothoracicSurgeon.birthDate = "February 27, 1985";

        chiefSurgeon.name = "Teacher Kim";
        chiefSurgeon.title = "Chief Surgeon";
        chiefSurgeon.age = 57;
        chiefSurgeon.height = 178;
        chiefSurgeon.birthDate = "November 4, 1964";

        System.out.println("\n\nDoctors of Doldam Hospital");
        System.out.println("\tName: " + generalSurgeon.name);
        System.out.println("\tTitle: " + generalSurgeon.title);
        System.out.println("\tAge: " + generalSurgeon.age);
        System.out.println("\tHeight: " + generalSurgeon.height + " cm");
        System.out.println("\tBirthdate: " + generalSurgeon.birthDate);
        System.out.println("");
        System.out.println("\tName: " + cardiothoracicSurgeon.name);
        System.out.println("\tTitle: " + cardiothoracicSurgeon.title);
        System.out.println("\tAge: " + cardiothoracicSurgeon.age);
        System.out.println("\tHeight: " + cardiothoracicSurgeon.height + " cm");
        System.out.println("\tBirthdate: " + cardiothoracicSurgeon.birthDate);
        System.out.println("");
        System.out.println("\tName: " + chiefSurgeon.name);
        System.out.println("\tTitle: " + chiefSurgeon.title);
        System.out.println("\tAge: " + chiefSurgeon.age);
        System.out.println("\tHeight: " + chiefSurgeon.height + " cm");
        System.out.println("\tBirthdate: " + chiefSurgeon.birthDate);
        System.out.println("\n");

        Nurses headNurse = new Nurses();
        Nurses midwife = new Nurses();
        Nurses triageNurse = new Nurses();

        headNurse.name = "Jin Kyung";
        headNurse.title = "Head Nurse";
        headNurse.age = 40;
        headNurse.salary = 130000.00;

        midwife.name = "Kim Hye-Soo";
        midwife.title = "Midwife Nurse";
        midwife.age = 51;
        midwife.salary = 79000.53;

        triageNurse.name = "Seo Eun-so";
        triageNurse.title = "Triage Nurse";
        triageNurse.age = 26;
        triageNurse.salary = 58750.00;

        System.out.println("Nurses of Doldam Hospital");
        System.out.println("\tName: " + headNurse.name);
        System.out.println("\tTitle: " + headNurse.title);
        System.out.println("\tAge: " + headNurse.age);
        System.out.println("\tSalary: " + headNurse.salary);
        System.out.println("");
        System.out.println("\tName: " + midwife.name);
        System.out.println("\tTitle: " + midwife.title);
        System.out.println("\tAge: " + midwife.age);
        System.out.println("\tSalary: " + midwife.salary);
        System.out.println("");
        System.out.println("\tName: " + triageNurse.name);
        System.out.println("\tTitle: " + triageNurse.title);
        System.out.println("\tAge: " + triageNurse.age);
        System.out.println("\tSalary: " + triageNurse.salary);
        System.out.println("\n");

        alliedProfessionals pharmacist = new alliedProfessionals();
        alliedProfessionals physiotherapist = new alliedProfessionals();
        alliedProfessionals podiatrist = new alliedProfessionals();

        pharmacist.name = "Song Hyeon-Cheol";
        pharmacist.title = "Pharmacist";
        pharmacist.age = 59;
        pharmacist.salary = 49000.00;

        physiotherapist.name = "Park Ji-Yeon";
        physiotherapist.title = "Physiotherapist";
        physiotherapist.age = 43;
        physiotherapist.salary = 79000.53;

        podiatrist.name = "Kim Hong-Fa";
        podiatrist.title = "Podiatrist";
        podiatrist.age = 36;
        podiatrist.salary = 90750.00;

        System.out.println("Allied Professionals of Doldam Hospital");
        System.out.println("\tName: " + pharmacist.name);
        System.out.println("\tTitle: " + pharmacist.title);
        System.out.println("\tAge: " + pharmacist.age);
        System.out.println("\tSalary: " + pharmacist.salary);
        System.out.println("");
        System.out.println("\tName: " + physiotherapist.name);
        System.out.println("\tTitle: " + physiotherapist.title);
        System.out.println("\tAge: " + physiotherapist.age);
        System.out.println("\tSalary: " + physiotherapist.salary);
        System.out.println("");
        System.out.println("\tName: " + podiatrist.name);
        System.out.println("\tTitle: " + podiatrist.title);
        System.out.println("\tAge: " + podiatrist.age);
        System.out.println("\tSalary: " + podiatrist.salary);
        System.out.println("\n");
    }
}

class Doctors {
    String name;
    String title;
    int age;
    String birthDate;
    double height;
}

class Nurses {
    String name;
    String title;
    int age;
    double salary;
}

class alliedProfessionals {
    String name;
    String title;
    int age;
    double salary;
}