import java.util.Scanner;
public class Postcode
{
    public static void main()
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your postcode!");
        String postcode = scanner.nextLine();
        System.out.println(postcode.toUpperCase());
    }
}
