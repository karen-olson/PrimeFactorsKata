import java.util.List;

public class PrimeFactors {
    public List<Integer> factor(Integer n) {
        if (n > 1) {
            return List.of(n);
        }
        return List.of();
    }
}