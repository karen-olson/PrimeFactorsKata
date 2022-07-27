import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {
    @Test void zeroHasNoPrimeFactors() {
        assertEquals(List.of(), new PrimeFactors().factor(0));
    }

    @Test void oneHasNoPrimeFactors() {
        assertEquals(List.of(), new PrimeFactors().factor(1));
    }

    @Test void twoHasAPrimeFactorOfTwo() {
        assertEquals(List.of(2), new PrimeFactors().factor(2));
    }
}

