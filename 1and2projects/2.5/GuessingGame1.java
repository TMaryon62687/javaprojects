import java.util.Scanner;

public class GuessingGame1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "RANDOM";
		StringBuilder guess = new StringBuilder("??????");
		int notdone = 0;
		while (notdone == 0){
			System.out.println("Please enter your 6 character guess");
			String userguess = sc.nextLine();
			userguess = userguess.toUpperCase();
			for (int i = 0; i < 6; i++) {
				if (word.charAt(i) == userguess.charAt(i)){
					guess.setCharAt(i, word.charAt(i));
					}		
			}
			String guess2 = guess.toString();
			if (guess2.equals(word)){
				notdone = 1;
				System.out.println("Well done you won!");
			}
			System.out.println(guess);
				}
				
			}
		
	}		
