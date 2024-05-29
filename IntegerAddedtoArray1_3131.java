import java.util.Arrays;

public class IntegerAddedtoArray1_3131 {

    public  static int addedInteger(int[] nums1, int[] nums2) {
        int x;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        x=nums2[0]-nums1[0];
        return x;
    }
    public static void main(String[] args) {
       int x= addedInteger(new int []{2,6,4}, new int[]{9,7,5});
       System.out.println(x);

    }
}