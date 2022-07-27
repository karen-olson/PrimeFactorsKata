import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> factor(Integer n) {
        List<Integer> primes = new ArrayList<Integer>();

        for (int divisor = 2; n > 1; divisor++) {
            for (; n % divisor == 0; n /= divisor) {
                primes.add(divisor);
            }
        }
        return primes;
    }
}