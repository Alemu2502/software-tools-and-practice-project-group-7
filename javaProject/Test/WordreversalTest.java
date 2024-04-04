import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WordReversalTest {

    @Test
    public void testReverseWords() {
        String input = "Dog bites man";
        String expectedOutput = "man bites Dog";
        String actualOutput = WordReversal.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
