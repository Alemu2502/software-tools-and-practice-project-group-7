import java.util.Scanner;
import java.util.*;
public class PalindromeInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        
        if(isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while(left < right) {
            if(word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

