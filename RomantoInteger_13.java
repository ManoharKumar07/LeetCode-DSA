import java.util.*;

public class RomantoInteger_13 {
   
 

   
        public static int romanToInt(String s) {
    
            Map <String,Integer> map = new HashMap<>();
            map.put("I",1);
            map.put("V",5);
            map.put("X",10);
            map.put("L",50);
            map.put("C",100);
            map.put("D",500);
            map.put("M",1000);
            
            int num = 0;
            int prevVal = 0;
    
            for(int i = s.length() - 1; i >= 0; i--) {
                int curVal = map.get(String.valueOf(s.charAt(i)));
                if(curVal < prevVal) {
                    num -= curVal;
                      prevVal = curVal;
                } else {
                    num += curVal;
                      prevVal = curVal;
                }
              
            }
            
            return num;
        }
    
    public static void main(String[] args) {
        System.out.println(romanToInt("XV"));
    }
}
// class Solution {
//     public int romanToInt(String s) {

//         Map <String,Integer> map = new HashMap<>();
//         map.put("I",1);
//         map.put("V",5);
//         map.put("X",10);
//         map.put("L",50);
//         map.put("C",100);
//         map.put("D",500);
//         map.put("M",1000);
//  int num=0;
//  int preval=0;
//  int curval=0;
//  for(int i=s.length()-1;i>=0;i++){
//     curval=map.get(String.valueOf(s.charAt(i)));
//     if(curval<preval){
//         num=num-preval;
//         preval=curval;
//     }
//     else if(curval>preval){
//         num=num+curval;
// preval=curval;
//     }
//     else{
//         preval=preval+curval;
//     }

//  }



        // num = map.get(String.valueOf(s.charAt(0)));
        // subval = num;
        // for(int i = 1; i < s.length(); i++) {
        //     if(map.get(String.valueOf(s.charAt(i))) < map.get(String.valueOf(s.charAt(i - 1)))) {
        //         num = num + map.get(String.valueOf(s.charAt(i)));
        //         subval = map.get(String.valueOf(s.charAt(i))); // Update subval here
        //     }

        //     if(map.get(String.valueOf(s.charAt(i))) > map.get(String.valueOf(s.charAt(i - 1)))) {
        //         num = num + (map.get(String.valueOf(s.charAt(i))) - subval);
        //         subval = map.get(String.valueOf(s.charAt(i))); // Update subval here
        //     } else {
        //         subval = subval + map.get(String.valueOf(s.charAt(i))); // Update subval here
        //     }
        // }

