public class GCDComparison {

    public static void main(String[] args) {
        int a = 14;
        int b = 48;

        EuclideanAlgorithm euclidean = new EuclideanAlgorithm();
        MiddleSchoolMethod middleSchool = new MiddleSchoolMethod();
        ConsecutiveIntegerChecking consecutive = new ConsecutiveIntegerChecking();

        long startTime, endTime, duration;

        // Measure Euclidean Algorithm
        startTime = System.nanoTime();
        int gcdEuclidean = euclidean.gcd(a, b);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Euclidean GCD: " + gcdEuclidean + " (Time: " + duration + " ns)");

        // Measure Middle School Method
        startTime = System.nanoTime();
        int gcdMiddleSchool = middleSchool.gcd(a, b);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Middle School GCD: " + gcdMiddleSchool + " (Time: " + duration + " ns)");

        // Measure Consecutive Integer Checking
        startTime = System.nanoTime();
        int gcdConsecutive = consecutive.gcd(a, b);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Consecutive Integer Checking GCD: " + gcdConsecutive + " (Time: " + duration + " ns)");
    }
}
