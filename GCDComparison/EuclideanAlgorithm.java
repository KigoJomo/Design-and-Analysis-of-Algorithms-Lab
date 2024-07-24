public class EuclideanAlgorithm {
    public int gcd(int... numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            result = gcd(result, number);
        }
        return result;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
