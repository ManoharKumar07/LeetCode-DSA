// The Arrays and HashMap can be imported from util package

// class TwoSum_1 {
//     public static int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for (int j=0;j<nums.length;j++){
//                 if(i==j)
//                 continue;
//                 if(nums[i]+nums[j]==target){
//                 return new int [] {i,j};
//                 }
//             }
//         }
//       return new int []{};  
//     }
//     public static void main (String args[]){
// int result []=twoSum(new int []{3,4,5},9); 
// for(int i:result){
//     System.out.println(i);
// }
//     }
// }


// int[] twoSumHashing(int[] nums, int target) {

//     // Create a HashMap
//     Map<Integer, Integer> map = new HashMap<>();

//     for (int i = 0; i < nums.length; i++) {

//       // Get the complement using the target value
//       int complement = target - nums[i];

//       // Search the hashmap for complement, if found, we got our pair
//       if (map.containsKey(complement)) {
//         return new int[]{map.get(complement), i};
//       }

//       // Put the element in hashmap for subsequent searches.
//       map.put(nums[i], i);
//     }
//     throw new IllegalArgumentException("No two sum solution");
//   }

// }
import java.util.*;

class TwoSum_1{

public static int [] twosumHashing(int nums[],int target){
    Map <Integer,Integer> map=new HashMap<>();

    for (int i=0;i<nums.length;i++){

        int compliment = target - nums[i];

        if(map.containsKey(compliment)){
            return new int[]{map.get(compliment), i};

           
        }
        map.put(nums[i],i);

    }
    throw new IllegalArgumentException("no solution");


}

    public static void main (String args[]){
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value of the target");
        target=sc.nextInt();
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
    
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        sc.close();
         int [] indexes=twosumHashing(arr, target);
System.out.println("Solution");
         for(int i:indexes){
            System.out.println(i);
         }


    }
 
}