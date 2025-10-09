import java.util.Scanner;

public class a3_User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner -> name of the class
                                                   // scanner -> name of the object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // nextline() read spaces but next() did not read spaces

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();


        System.out.println();
        System.out.println("Hello "+ name+"!");
        System.out.println("You are "+age+" years old.");

        if (isStudent){
            System.out.println("You are a student.");
        }
        else System.out.println("You are not a student.");

        System.out.println("Your GPA is: "+gpa);


        scanner.close();  //If you don't close the scanner it can lead a unexpected behaviour

    }
}
