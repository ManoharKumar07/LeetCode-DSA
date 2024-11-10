
import java.util.Arrays;

public class MoveNegBPosE {
    static void Move(int [] arr ,int size){
int left=0,right=size-1;
while(left<=right){
    if(arr[left]>0){
        while(right>=left && arr[right]>0){
        
            right--;
          
        }
       int temp = arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
       left++;
       right--;
    }
    else{
        left++;
    }
}
    }
    public static void main(String[] args) {
        int [] arr = {-1,2,4,-3,6,-8};
        Move(arr, 6);
    
            System.out.println(Arrays.toString(arr));
        
    }
}
