import java.io.*;
public class BufferReaderSum {


    public static void main(String[] args) throws Exception  {
        int val1, val2, result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the input line with both numbers
        String input = br.readLine();
        
        // Split the input string by space
        String[] numbers = input.split(" ");
        
        // Parse the numbers
        val1 = Integer.parseInt(numbers[0]);
        val2 = Integer.parseInt(numbers[1]);
        
        // Calculate the sum
        result = val1 + val2;
        
        // Print the result
        System.out.println(result);
    }
}


