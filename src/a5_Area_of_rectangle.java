import java.util.Scanner;

public class a5_Area_of_rectangle {
    public static void main(String[] args) {
        //Calculate are of rectangle

        double width = 0, height = 0, area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: "+ area + " cm^2");

        scanner.close();
    }
}
