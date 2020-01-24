import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please input a word all lowercase");
		String word = scnr.nextLine();
		
		System.out.println("Please input a sentence that includes \"Waldo\", and \"math\"");
		String phrase = scnr.nextLine();
		
		System.out.println("Please input another word");
		String a = scnr.nextLine();
		
		System.out.println("Please input ANOTHER word");
		String b = scnr.nextLine();
		
		System.out.println("Please input one last word");
		String s = scnr.nextLine();
		
		capatalize(word);
		wheresWaldo(phrase);
		firstThingsFirst(a, b);
		reverse(s);
		soLong(a, b);
		aftermath(phrase);
		letterSize(word);
		camelCase(phrase);
				

	}

	public static void capatalize(String word) {
		System.out.print("capitalize: ");
		System.out.println(word.toUpperCase().charAt(0) + word.substring(1));
	}

	public static void wheresWaldo(String phrase) {
		System.out.print("wheresWaldo: ");
		System.out.println(phrase.indexOf("Waldo"));
	}

	public static void firstThingsFirst(String a, String b) {
		char a1 = a.toUpperCase().charAt(0);
		char b1 = b.toUpperCase().charAt(0);
		System.out.print("firstThingsFirst: ");
		if (a1 < b1) {
			System.out.println(a + " " + b);
		} else if (b1 < a1) {
			System.out.println(b + " " + a);
		} else
			System.out.println("Both start with the same letter");
	}

	public static void reverse(String s) {

		String reverse1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse1 += s.charAt(i);
		}
		System.out.println("reverse: ");
		System.out.println(reverse1);
	}

	public static void soLong(String a, String b) {
		int a2 = a.length();
		int b2 = b.length();
		System.out.print("soLong: ");
		if (a2 > b2) {
			System.out.println(a + " " + b);
		} else if (b2 > a2) {
			System.out.println(b + " " + a);
		} else
			System.out.println("Both words are the same length.");
	}

	public static void aftermath(String phrase) {
		int start = phrase.toLowerCase().indexOf("math");
		System.out.print("afterMath: ");
		System.out.println(phrase.substring(start + 4));
	}

	public static void letterSize(String word) {
		System.out.println("letterSize: ");
		for (int i = 0; i < word.length(); i++)
			System.out.println(word.charAt(i));
	}
	
	public static void camelCase(String phrase) {
		 String result = "";
	        char firstChar = phrase.charAt(0);
	        result = result + Character.toUpperCase(firstChar);
	        for (int i = 1; i < phrase.length(); i++) {
	            char currentChar = phrase.charAt(i);
	            char previousChar = phrase.charAt(i - 1);
	            if (previousChar == ' ') {
	                result = result + Character.toUpperCase(currentChar);
	            } else {
	                result = result + Character.toLowerCase(currentChar);
	            }
	            result = result.trim().replaceAll("\\s+", " ");
	            
	        }
	        
	        System.out.println(result.toLowerCase().charAt(0) + result.substring(1));
	}
}












