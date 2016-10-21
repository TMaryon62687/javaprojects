import java.util.Scanner;
public class Password
{
    public static void main()
    { 
        int done = 0;
        Scanner scanner = new Scanner(System.in);
        while (done == 0){
            System.out.println("Please enter your password");
            String pword = scanner.nextLine();
            System.out.println("Please enter your password again");
            String pword2 = scanner.nextLine();
            if (pword.equals(pword2)){
                System.out.println("Password verified");
                done = 1;
    }
}
}
}
