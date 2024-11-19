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
