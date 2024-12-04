public class GCDofStrinf1071 {
    public static int gcd(int len1,int len2){
        if(len1==0){
            return len2;
        }
        if(len2==0){
            return len1;
        }
        if(len1<len2){
           return gcd(len1,len2%len1);
        }
        return gcd(len1%len2,len2);
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int divisorlength=gcd(str1.length(),str2.length());
        return str1.substring(0,divisorlength);
    }
    public static void main(String[] args) {
        
    }
}
// ### GCD of Strings - Explanation

// To find the largest string `x` that divides two strings `str1` and `str2`, we use the **greatest common divisor (GCD)** of their lengths. The key idea is that the length of `x` must divide both `str1.length()` and `str2.length()`.

// **Steps**:
// 1. Check if `str1 + str2` equals `str2 + str1`. If not, return `""` (no common divisor string exists).
// 2. Compute `gcd(str1.length(), str2.length())`, which gives the length of the largest possible divisor string.
// 3. Return the prefix of `str1` with this GCD length, as it is the candidate string that can repeat to form both `str1` and `str2`.

// **Example**:
// - `str1 = "ABCABC"`, `str2 = "ABC"`
//   - `gcd(6, 3) = 3`.
//   - Result: `str1.substring(0, 3) = "ABC"`.

// This approach leverages mathematical properties for efficiency, avoiding brute force substring checks.
