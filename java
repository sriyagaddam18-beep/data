public class FactorialIterative {
    public static void main(String[] args) {
        int number = 5; // Change this value to find another factorial
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }

    public static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
