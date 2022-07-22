import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args){
		Scanner userIn = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = userIn.nextLine(), newWord = "";
		char c;
		System.out.println("Original Word: " + word);
		for (int i = 0; i < word.length(); i++){
			c = word.charAt(i);
			newWord = c + newWord;
		}
		System.out.println("New Word: " + newWord);
	}
}
