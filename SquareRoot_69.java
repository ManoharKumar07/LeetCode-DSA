public class SquareRoot_69{
    public static int mySqrt(int x) {
  
        int low=1,high=x,mid;

        while(low<=high){
            mid=low+(high-low)/2;
            if(mid*mid<=x){
                low=mid+1;
            }
            else{
            high=mid-1;
            }
        }
        return high;
    }
 public static void main(String[] args) {

     int sq = mySqrt(10);
     System.out.println(sq);
 }
    
}
