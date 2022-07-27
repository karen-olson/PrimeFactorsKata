import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {
    @Test void zeroHasNoPrimeFactors() {
        assertEquals(Collections.emptyList(), new PrimeFactors().factor(0));
    }

    @Test void twoHasPrimeFactorOfTwo() {
        assertEquals(List.of(2), new PrimeFactors().factor(2));
    }

    @Test void threeHasAPrimeFactorOfThree() {
        assertEquals(List.of(3), new PrimeFactors().factor(3));
    }

    @Test void fourHasPrimeFactorsOfTwoAndTwo() {
        assertEquals(List.of(2, 2), new PrimeFactors().factor(4));
    }

    @Test void sixHasPrimeFactorsOfTwoAndThree() {
        assertEquals(List.of(2, 3), new PrimeFactors().factor(6));
    }

    @Test void eightHasPrimeFactorsOfTwoTwoAndTwo() {
        assertEquals(List.of(2, 2, 2), new PrimeFactors().factor(8));
    }

    @Test void nineHasPrimeFactorsOfThreeAndThree() {
        assertEquals(List.of(3, 3), new PrimeFactors().factor(9));
    }
}

