import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Would you like to test capitalize, wheresWaldo, firstThingsFirst, reverse, soLong, afterMath, letterSize, or camelCase?");
		String choice = scnr.next();
		
		switch (choice) {
		case "capitalize" :
			System.out.println("Please input a lowercase word");
			String word = scnr.next();
			StringLab.capatalize(word);
			break;
			
		case "wheresWaldo" :
			System.out.println("Please input a phrase that includes the word \"Waldo\"");
			String phrase = scnr.nextLine();
			StringLab.wheresWaldo(phrase);
			break;
			
		case "firstThingsFirst" :
			System.out.println("Please input the first word");
			String a = scnr.next();
			System.out.println("Please input the last word");
			String b = scnr.next();
			StringLab.firstThingsFirst(a, b);
			break;
			
		case "reverse" :
			System.out.println("Please input a word");
			String s = scnr.next();
			StringLab.reverse(s);
			break;
			
		case "soLong" :
			System.out.println("Please input the first word");
			String a1 = scnr.next();
			System.out.println("Please input the last word");
			String b1 = scnr.next();
			StringLab.soLong(a1, b1);
			break;
			
		case "afterMath" :
			System.out.println("Please input a phrase");
			String phrase1 = scnr.nextLine();
			StringLab.aftermath(phrase1);
			break;
			
		case "letterSize" :
			System.out.println("Please input a word");
			String word1 = scnr.next();
			StringLab.letterSize(word1);
			break;
		
		case "camelCase" :
			System.out.println("Please input a sentence");
			String phrase2 = scnr.nextLine();
			StringLab.camelCase(phrase2);
			break;
		}
		
		System.out.println("Thank you for testing out my program!");
		scnr.close();
	}

}
