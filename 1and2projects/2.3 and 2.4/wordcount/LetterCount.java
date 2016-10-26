
package wordcount;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LetterCount {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int x = 0;
	     int lettercount = 0;
	     String word = null;
	     while (x == 0){
		     System.out.println("Please enter a string:");
		     word = sc.nextLine();
		     lettercount = word.length();
		     if (lettercount != 0){
		    	 x = 1;
		     }
		     else {
		    	System.out.println("Please enter a string longer than 0."); 
		     }
	     }
	     int vowel = countVowels(word, lettercount);
	     System.out.println("This word contains " +vowel+ " vowels.");
	     int consonant = lettercount-vowel;
	     System.out.println("This word contains " +consonant+ " consonants.");
	}
	public static int countVowels (String word, int lettercount){
		int vowel = 0;
		for (int i = 0;i < lettercount;i++){
			if (Pattern.matches("^[aeiuo]+$",word.substring(i,i+1))){
				vowel++;	
			}
		}	
		return vowel;
		
	}
	
}
