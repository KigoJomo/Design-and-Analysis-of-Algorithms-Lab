import java.util.Scanner;

public class GCDComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers to find the GCD of: ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Euclidean Algorithm
        EuclideanAlgorithm euclidean = new EuclideanAlgorithm();
        long start = System.nanoTime();
        int gcdEuclidean = euclidean.gcd(numbers);
        long end = System.nanoTime();
        long timeEuclidean = end - start;

        // Middle School Procedure
        MiddleSchoolMethod middleSchool = new MiddleSchoolMethod();
        start = System.nanoTime();
        int gcdMiddleSchool = middleSchool.gcd(numbers);
        end = System.nanoTime();
        long timeMiddleSchool = end - start;

        // Consecutive Integer Checking
        ConsecutiveIntegerChecking consecutiveIntegerChecking = new ConsecutiveIntegerChecking();
        start = System.nanoTime();
        int gcdConsecutiveIntegerChecking = consecutiveIntegerChecking.gcd(numbers);
        end = System.nanoTime();
        long timeConsecutiveIntegerChecking = end - start;

        System.out.println("\nGCD Calculation Results:");
        System.out.println("Euclidean Algorithm: GCD = " + gcdEuclidean + ", Time = " + timeEuclidean + " ns");
        System.out
                .println("Middle School Procedure: GCD = " + gcdMiddleSchool + ", Time = " + timeMiddleSchool + " ns");
        System.out.println("Consecutive Integer Checking: GCD = " + gcdConsecutiveIntegerChecking + ", Time = "
                + timeConsecutiveIntegerChecking + " ns");

        System.out.println("\nPerformance Analysis:");
        System.out.println(
                "1. Euclidean Algorithm is the most efficient, especially for large numbers, with a logarithmic time complexity.");
        System.out.println(
                "2. Middle School Procedure is generally slower due to the factorization process, which can be time-consuming for large numbers.");
        System.out.println(
                "3. Consecutive Integer Checking is the least efficient, particularly for larger numbers, as it requires checking all integers up to the smallest number.");

        scanner.close();
    }
}
