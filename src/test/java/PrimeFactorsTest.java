import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {
    @Test void zeroHasNoPrimeFactors() {
        assertEquals(List.of(), new PrimeFactors().factor(0));
    }
}

