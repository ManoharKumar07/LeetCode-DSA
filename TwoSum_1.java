

class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(i==j)
                continue;
                if(nums[i]+nums[j]==target){
                return new int [] {i,j};
                }
            }
        }
      return new int []{};  
    }
    public static void main (String args[]){
int result []=twoSum(new int []{3,4,5},9); 
for(int i:result){
    System.out.println(i);
}
    }
}