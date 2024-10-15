import java.util.Scanner;

class BinaryToDecimal{

    static void Converter(int Num){
        double res = 0;
        int power =0;
        while(Num>0){
            int unitDigit = Num%10;
            Num= Num/10;
            res=res+unitDigit*Math.pow(2,power);
            power++;

        }

        System.out.println("Result is :"+(int) res);
    }

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int Num = sc.nextInt();

        sc.close();
        Converter(Num);
    }
}