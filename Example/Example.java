class Example {
    // Euclidean Algorithm
    // To find GCD

    public int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Example example = new Example();
        int a = 15;
        int b = 70;
        int result = example.gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + result);
    }
}
