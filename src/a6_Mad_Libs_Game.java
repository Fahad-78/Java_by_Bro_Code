import java.util.Scanner;

public class a6_Mad_Libs_Game {
    public static void main(String[] args) {
        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1 , noun1 , verb1 , adjective2 , adjective3;

        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a "+ adjective1 + "zoo. In an exhibit, I saw a "+ noun1 +".");
        System.out.println(noun1 + " was "+ adjective2 + " and "+ verb1+"!");
        System.out.println("I was "+ adjective3 + "!");

        scanner.close();
    }
}
