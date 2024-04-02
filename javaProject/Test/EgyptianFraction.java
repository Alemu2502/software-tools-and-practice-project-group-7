import java.util.ArrayList;
import java.util.Scanner;

public class EgyptianFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        ArrayList<Integer> egyptianFractions = findEgyptianFractions(numerator, denominator);
        System.out.println("Egyptian Fractions:");
        for (int fraction : egyptianFractions) {
            System.out.print("1/" + fraction + " ");
        }
    }

    public static ArrayList<Integer> findEgyptianFractions(int numerator, int denominator) {
        ArrayList<Integer> egyptianFractions = new ArrayList<>();
        while (numerator != 0) {
            int ceil = (int) Math.ceil((double) denominator / numerator);
            egyptianFractions.add(ceil);
            numerator = numerator * ceil - denominator;
            denominator = denominator * ceil;
        }
        return egyptianFractions;
    }
}
