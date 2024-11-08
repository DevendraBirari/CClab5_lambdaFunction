import java.util.HashMap;
import java.util.Map;

public class FactorialCalculator {
    public Map<String, Object> handleRequest(Map<String, Integer> input) {
        int number = input.getOrDefault("number", 0);
        long factorialResult = calculateFactorial(number);

        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        response.put("factorial", factorialResult);
        return response;
    }

    private long calculateFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        Map<String, Integer> input = new HashMap<>();
        input.put("number", 5); // Example input
        System.out.println(calculator.handleRequest(input));
    }
}
