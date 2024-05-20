


public class MinimumOperation_3065 {

    
        public static int minOperations(int[] nums, int k) {
            int count =0;
            for (int i=0;i<nums.length;i++){
                if(nums[i]<k){
                    count++;
                }
            }
            return count;
        }

public static void main(String[] args) {
    int [] nums = new int[]{5,8,9,2,3,2,7,2,2};
    int result =minOperations(nums,7);
    System.out.println(result);
}

    }

