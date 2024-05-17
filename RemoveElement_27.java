/**
 * RemoveElement_27
 */
public class RemoveElement_27 {
    static int removeelement(int []nums,int val){

        int i=0,j;
        for (j=0;j<nums.length;j++){
         if(nums[j]!=val){
             nums[i]=nums[j];
             i++;
         }
     
        }
            return i;

    }

    public static void main(String[] args) {
        int [] nums = new int[]{4,8,9,2,4,7,6,9,2,2,0};
        int val=2;
       int k= removeelement(nums, val);
       for (int i = 0; i < k; i++) {
        System.out.print(nums[i]+"  ");
           
       }


    }
}