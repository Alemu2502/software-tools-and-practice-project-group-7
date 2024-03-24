package Test;
import java.util.Scanner;
public class Pangram{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a pangram: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String str) {
        // Convert the input string to lowercase
        str = str.toLowerCase();

        // Create a boolean array to mark the presence of each alphabet
        boolean[] alphabetPresent = new boolean[26];

        // Iterate through the string and mark the presence of each alphabet
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true;
            }
        }

        // Check if all alphabets are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
	}


