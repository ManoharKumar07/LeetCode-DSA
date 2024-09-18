import java.util.Scanner;

public class ReverseString_344{

    public static void reversestring(char [] s){

        char temparr []=new char[s.length];
        int i=0;
        for(int j=s.length-1;j>=0;j--){
            temparr[i]=s[j];
            i++;
        }
     for(int k=0;k<temparr.length;k++){
        s[k]=temparr[k];
     }

    }

public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string to reverse:");
String word=sc.nextLine();
sc.close();
char [] s= new char[word.length()];
for (int i=0;i<word.length();i++){
    s[i]=word.charAt(i);
}
for(char c:s){
    System.out.println(c);
}
reversestring(s);

System.out.println("Reversed String:");
String reversedstring =new String(s);
System.out.println(reversedstring);



}

}