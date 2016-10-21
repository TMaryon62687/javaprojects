import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Lottery
{
    public static void main()
    {
    Scanner scanner = new Scanner(System.in);
    int[] randomnumbers = new int[7];
    int[] numbers = new int[7];
    int number = 0;
    System.out.println("Please enter 6 numbers (between 1 and 49) that you think will win!");
    for(int x = 0; x < 6; x++) {
        number = scanner.nextInt();
        if (number >= 1 && number <= 49){
            numbers[x] = number;
    }
        else {
            x--;
    }
    }    
    System.out.println("Please enter your bonus ball number!");
    numbers[6] = scanner.nextInt();
    for(int i = 0; i < randomnumbers.length; i++) {
        randomnumbers[i] = (int)(Math.random()*49 + 1);
    }
    System.out.println("Your Numbers: " + Arrays.toString(numbers));
    System.out.println("Winning Numbers: " + Arrays.toString(randomnumbers));
    int winningball = 0;
    for(int z = 0; z < 6; z++){
        for(int y = 0; y < 6; y++){
        if (numbers[y] == randomnumbers[z]){
            winningball++;
        }
        }   
    }   
    int bonusball = 0;
    System.out.println("You got " + winningball + " balls right!");
    if (numbers[6] == randomnumbers[6]){
        bonusball = 1;
        System.out.println("You also got the bonus ball!");
    }
    if (winningball == 6){
        System.out.println("You won £1,000,000!");
        return;
    }
    if (winningball == 5 && bonusball == 1){
        System.out.println("You won £100,000!");
    }
    if (winningball == 5){
        System.out.println("You won £10,000!");
    }
    if (winningball == 4){
        System.out.println("You won £100!");
    }
    if (winningball == 3){
        System.out.println("You won £10!");
    }
    else {
        System.out.println("You didn't win this time, sorry :(");
        
        
    }
    
}
}