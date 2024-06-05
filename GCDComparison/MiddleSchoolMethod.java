import java.util.ArrayList;
import java.util.List;

public class MiddleSchoolMethod {
    private List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public int gcd(int a, int b) {
        List<Integer> factorsA = primeFactors(a);
        List<Integer> factorsB = primeFactors(b);
        int gcd = 1;
        for (int factor : factorsA) {
            if (factorsB.contains(factor)) {
                gcd *= factor;
                factorsB.remove((Integer) factor);
            }
        }
        return gcd;
    }
}
