public class a2_Variables {
    public static void main(String[] args) {
        // variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // reference = memory address (stack) that points to the (heap)

        // Primitive   vs   Reference
        // ---------        ---------
        // int              string
        // double           array
        // char             object
        // boolean

        // 2 step to creating a variable
        // -----------------------------
        // 1.declaration
        // 2.assignment / initialize


        int age; //declaration
        age = 22; //Assignment/initialization
        int year = 2025;
        int quantity = 1;
        System.out.println("Integer-> Age: "+age+" The year is: "+ year + " and the quantity is: "+ quantity);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;
        System.out.println("Double-> Price: $"+ price + " gpa: "+ gpa + " Temperature: "+ temperature);


        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println("Char-> Grade: "+grade+" Symbol: "+symbol+" Currency: "+currency);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        System.out.println("Boolean-> Student: "+isStudent+" Sale: "+forSale+" Online: "+isOnline);

        //Usefulness of Boolean
        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }

        String name = "Fahad Sarker";
        String food = "Pizza";
        System.out.println("String-> Name: "+name+" Favourite food: "+food);


    }
}
