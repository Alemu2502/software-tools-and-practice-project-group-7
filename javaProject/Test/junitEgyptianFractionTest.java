import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EgyptianFractionTest {
    @Test
    public void testFindEgyptianFractions() {
        assertEquals("[2, 3, 12]", EgyptianFraction.findEgyptianFractions(7, 12).toString());
        assertEquals("[2, 6, 12]", EgyptianFraction.findEgyptianFractions(7, 6).toString());
        assertEquals("[3, 11]", EgyptianFraction.findEgyptianFractions(5, 11).toString());
    }
}
