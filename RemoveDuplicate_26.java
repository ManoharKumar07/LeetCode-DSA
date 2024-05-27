import java.util.Arrays;
import java.util.Scanner;
class RemoveDuplicate_26{

    public static int removeDuplicates(int[] nums) {
        int [] temp=new int[nums.length];
        int ptr=0;
        temp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=temp[ptr]){
                ptr++;
                temp[ptr]=nums[i];
            }
        }
        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
        return (ptr+1);
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int nums[]= new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println("Sorting the array:");
        Arrays.sort(nums);
        for (int idx = 0; idx < nums.length; idx++) {
            System.out.println(nums[idx]);
            
        }
        int duplen=removeDuplicates(nums);
        System.out.println("Duplicate Removed array");
        
        for (int idx = 0; idx < duplen; idx++) {
            System.out.println(nums[idx]);
            
        }
    }
}