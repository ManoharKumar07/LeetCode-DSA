import java.util.ArrayList;
import java.util.List;

public class ThreePartsNarray {
    public static void partitionArray(int[] arr, int N) {
        List<Integer> equals = new ArrayList<>();
        List<Integer> lessThan = new ArrayList<>();
        List<Integer> greaterThan = new ArrayList<>();

        // Partition the array into three lists based on the value N
        for (int num : arr) {
            if (num == N) {
                equals.add(num);
            } else if (num < N) {
                lessThan.add(num);
            } else {
                greaterThan.add(num);
            }
        }

        // Combine all parts together in the right order
        int index = 0;
        for (int num : equals) {
            arr[index++] = num;
        }
        for (int num : lessThan) {
            arr[index++] = num;
        }
        for (int num : greaterThan) {
            arr[index++] = num;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 5, 5, 3, 2, 34, 6};
        int N = 5;

        partitionArray(arr, N);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

