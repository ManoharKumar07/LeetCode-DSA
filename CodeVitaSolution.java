import java.util.*;

public class CodeVitaSolution {
    
    // Memoized function to calculate maximum removals
    private static int calculateRemovals(String mainStr, List<String> patterns, Map<String, Integer> memo) {
        // Check if the result for the current string is already computed
        if (memo.containsKey(mainStr)) {
            return memo.get(mainStr);
        }

        int maxRemovals = 0;

        // Iterate through all patterns
        for (String pattern : patterns) {
            int pos = mainStr.indexOf(pattern);
            if (pos != -1) {
                // Create a new string after removing the pattern
                String updatedStr = mainStr.substring(0, pos) + mainStr.substring(pos + pattern.length());
                maxRemovals = Math.max(maxRemovals, 1 + calculateRemovals(updatedStr, patterns, memo));
            }
        }

        // Store the result in the memoization map and return
        memo.put(mainStr, maxRemovals);
        return maxRemovals;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of patterns
        int numPatterns = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input patterns
        List<String> patterns = new ArrayList<>();
        for (int i = 0; i < numPatterns; i++) {
            patterns.add(scanner.nextLine());
        }

        // Input the main string
        String mainStr = scanner.nextLine();

        // Initialize memoization map
        Map<String, Integer> memo = new HashMap<>();

        // Call the function and print the result
        int result = calculateRemovals(mainStr, patterns, memo);
        System.out.println(result);

        scanner.close();
    }
}
