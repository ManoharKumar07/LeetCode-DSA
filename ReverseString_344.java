class Solution {
    public void reverseString(char[] s) {
        int i=0;
        char rev[]=new char[s.length];
        for(int j=s.length-1;j>=0;j--){
            rev[i]=s[j];
            i++;
        }

        for(int j=0;j<rev.length;j++){
            s[j]=rev[j];
        }
    }
}