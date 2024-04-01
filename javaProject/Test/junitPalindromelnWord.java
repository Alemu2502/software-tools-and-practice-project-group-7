import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeInWordTest {
    @Test
    void testIsPalindrome() {
        assertTrue(PalindromeInWord.isPalindrome("radar"));
        assertTrue(PalindromeInWord.isPalindrome("level"));
        assertTrue(PalindromeInWord.isPalindrome("deified"));
        assertFalse(PalindromeInWord.isPalindrome("hello"));
        assertFalse(PalindromeInWord.isPalindrome("world"));
    }
}
