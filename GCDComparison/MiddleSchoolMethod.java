import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiddleSchoolMethod {
    public int gcd(int... numbers) {
        if (numbers.length == 0)
            return 0;

        Map<Integer, Integer> commonFactors = primeFactorize(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            Map<Integer, Integer> currentFactors = primeFactorize(numbers[i]);
            commonFactors = getCommonFactors(commonFactors, currentFactors);
        }

        int gcd = 1;
        for (Map.Entry<Integer, Integer> factor : commonFactors.entrySet()) {
            gcd *= Math.pow(factor.getKey(), factor.getValue());
        }
        return gcd;
    }

    private Map<Integer, Integer> primeFactorize(int number) {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                number /= i;
            }
        }
        return factors;
    }

    private Map<Integer, Integer> getCommonFactors(Map<Integer, Integer> factors1, Map<Integer, Integer> factors2) {
        Map<Integer, Integer> commonFactors = new HashMap<>();
        for (Integer key : factors1.keySet()) {
            if (factors2.containsKey(key)) {
                commonFactors.put(key, Math.min(factors1.get(key), factors2.get(key)));
            }
        }
        return commonFactors;
    }
}
