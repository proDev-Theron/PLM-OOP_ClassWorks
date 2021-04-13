
/*
Bueno, Theron Adrianne A.
Block 3 - OOP

Week 3 - Laboratory Exercise
Write a Java program that demonstrates the use of Encapsulation.
*/
import java.util.*; //For Scanner class dependency

class HeightConverter {
    private static int feet, inches; // declared private variables

    public static void userInput() {
        // predefined standard input stream from Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value for variable 'feet': ");
        feet = sc.nextInt();
        System.out.print("Enter an integer value for variable 'inches': ");
        inches = sc.nextInt();

        sc.close(); // closed the Scanner #GoodDevPractice
    }

    public static void convertToCM() {
        double cmValue = (30.48 * feet) + (2.54 + inches);
        System.out.println("===============================================\n" + "The height " + feet + "'" + inches
                + "\" is " + cmValue + " in centimeters");
    }

    public static void main(String[] args) {
        System.out.println("Week 3 Lab Exercise: " + "Converting Imperial measurements to centimeters"
                + "\n===============================================");
        userInput();
        convertToCM();
    }
}
