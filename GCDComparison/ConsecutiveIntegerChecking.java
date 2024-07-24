public class ConsecutiveIntegerChecking {
    public int gcd(int... numbers) {
        int min = findMin(numbers);
        for (int i = min; i >= 1; i--) {
            boolean isCommonDivisor = true;
            for (int number : numbers) {
                if (number % i != 0) {
                    isCommonDivisor = false;
                    break;
                }
            }
            if (isCommonDivisor) {
                return i;
            }
        }
        return 1;
    }

    private int findMin(int... numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
