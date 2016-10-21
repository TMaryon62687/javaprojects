import java.util.Scanner;
public class FirstNameLastName
{
    public static void main()
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a saying");
        String saying = scanner.nextLine();
        System.out.println("That saying is " + saying.split(" ").length + " words long");
}
}
