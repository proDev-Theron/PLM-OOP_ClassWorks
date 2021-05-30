
/*
Bueno, Theron Adrianne A.
Block 3 - OOP

Week 11 - Laboratory Exercise
Directions: Create a simple program that demonstrate the Java Programming Fundamentals.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BatoPapelGunting {

    public static void main(String[] args) throws IOException {
        String user, comp;
        int u = 0, c = 0; // Score: 'u' for user, 'c' for computer
        int gameRunning = 1; // Used in loop at the end if the user want's to play again

        while (gameRunning > 0) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("============= LETS PLAY \"BATO BATO PICK\"  =============");
                do {
                    System.out.print("\n\nUser\'s choice: ");
                    user = br.readLine();
                    System.out.print("Computer\'s choice: ");
                    comp = br.readLine();

                    if (user.equals("Bato") && comp.equals("Papel")) {
                        c++;
                        System.out.println("Computer wins!");
                    } else if (user.equals("Bato") && comp.equals("Gunting")) {
                        u++;
                        System.out.println("User wins!");
                    }
                    if (user.equals("Bato") && comp.equals("Bato")) {
                        System.out.println("It's a tie!");
                    } else if (user.equals("Gunting") && comp.equals("Papel")) {
                        u++;
                        System.out.println("User wins!");
                    } else if (user.equals("Gunting") && comp.equals("Bato")) {
                        c++;
                        System.out.println("Computer wins!");
                    } else if (user.equals("Gunting") && comp.equals("Gunting")) {
                        System.out.println("It's a tie!");
                    } else if (user.equals("Papel") && comp.equals("Gunting")) {
                        c++;
                        System.out.println("Computer wins!");
                    } else if (user.equals("Papel") && comp.equals("Bato")) {
                        u++;
                        System.out.println("User wins!");
                    } else if (user.equals("Papel") && comp.equals("Papel")) {
                        System.out.println("It's a tie!");
                    }

                    System.out.println("\n\nLeaderboard:");
                    System.out.println("User: " + u);
                    System.out.println("Computer: " + c);

                } while (u < 3 && c < 3);
                if (u == 3) {
                    System.out.println("\n\n============= User wins! =============\n\n");
                } else {
                    System.out.println("\n\n============= Computer wins! =============\n\n");
                }
                gameRunning = 0; // end the game

                System.out.println("Press [1] to play again and [0] to exit the program");
                int playAgain = br.read();
                if (playAgain == 49) { // 1 is 49 in ASCII
                    gameRunning = 1;
                    // Reset scores
                    u = 0;
                    c = 0;
                } else {
                    System.out.println("============= THANK YOU FOR PLAYING BATO BATO PICK! =============");
                    System.exit(0);
                }

            } catch (Exception e) {
                return;
            }
        }
    }
}