import java.util.*;
public class ContainsDuplicateEle217 {

    public static void sort(int [] nums){
        for(int i=0;i<nums.length -1;i++){
            int largeIndex = 0;
            int largeValue = nums[0];
            for(int j=0;j<nums.length-i;j++){
                if(nums[j]>largeValue){
                    largeValue=nums[j];
                    largeIndex=j;
                }

            }
                        int temp;
            temp =nums[nums.length-1-i];
            nums[nums.length-1-i]=largeValue;
            nums[largeIndex]=temp;
        }
    }
    public boolean containsDuplicate(int[] nums) {
        //Brute force two loops
        //optimal using sorting and comparing two consequtive values
        //optimal using hashset if not present just insert into it
    
        // sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;

    HashSet<Integer> ArraySet = new HashSet<>();
    for (int num :nums){
       if( ArraySet.contains(num)){
        return true;
       }
       else{
        ArraySet.add(num);
       }
    }
    return false;
    }
}

