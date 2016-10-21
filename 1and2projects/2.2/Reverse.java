import java.util.Scanner;
public class Reverse
{
    public static void main()
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string you want in reverse");
        String toreverse = scanner.nextLine();
        int length = toreverse.length();
        while (length > 0){
            System.out.println(toreverse.charAt(length-1));
            length--;
        
        }
    }
}
