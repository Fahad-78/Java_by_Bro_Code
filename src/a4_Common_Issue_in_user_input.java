import java.util.Scanner;

public class a4_Common_Issue_in_user_input {
    public static void main(String[] args) {
        // Common Issue

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //For get rid of the input buffer after I click enter

        System.out.print("Enter your favourite colour: ");
        String colour = scanner.nextLine();

        System.out.println("You are "+ age +" years old.");
        System.out.println("You like the colour "+ colour );

        scanner.close();
    }
}
