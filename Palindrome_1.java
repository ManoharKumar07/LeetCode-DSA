import java.util.Scanner;

class Palindrome_1 {
    public static void main(String args[]) {
        int number,rem,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        number = sc.nextInt();
        int temp=number;
        while(number>0){
            rem = number % 10;
            rev= rev*10+rem;
            number = number/10;
        }
        if (temp==rev){
            System.out.println(temp+" is a Palindrome number");
        }
        else{
            System.out.println(temp+" is not a Palindrome number");
        }



    }
}