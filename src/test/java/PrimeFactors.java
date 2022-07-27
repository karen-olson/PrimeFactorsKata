import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> factor(Integer n) {
        List<Integer> primes = new ArrayList<Integer>();
        int divisor = 2;

        while (n > 1) {
            while (n % divisor == 0) {
                primes.add(divisor);
                n /= divisor;
            }
            divisor++;
        }
        if (n > 1) {
            primes.add(n);
        }
        return primes;
    }
}