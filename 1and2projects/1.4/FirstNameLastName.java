import java.util.Scanner;
public class FirstNameLastName
{
    public static void main()
    { 
        int done = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name (first and last)");
        String fullname = scanner.nextLine();
        System.out.println("Hello " + fullname.substring(fullname.lastIndexOf(" ")+1));
}
}
