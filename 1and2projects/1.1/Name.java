import java.util.Scanner;
public class Name
{
    public static void main()
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name.length() + " charecters long");
    }
}
