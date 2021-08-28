import Range.Range;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RangeTest {
    @Test
    public void isStartWitchInclusiveWithKampooShouldBetrue()
    {
        // Arrage
        Range range = new Range("(1,5]");

        // Act
        boolean actualResult = range.isStartWithInclusive();

        // Assert
        assertTrue(actualResult);
    }
}
