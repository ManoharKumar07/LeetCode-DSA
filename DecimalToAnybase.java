import java.util.Scanner;

public class DecimalToAnybase {
        static void Converter(int DecimalNum,int Base){

        double res =0;
        int power =0 ;
        while(DecimalNum>0){
            int rem = DecimalNum%Base;
            DecimalNum= DecimalNum/Base;
            res =  res + rem*Math.pow(10 ,power);
            power++;
        }
        System.err.println("Result is ="+(int) res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number:");
        int DecimalNum = sc.nextInt();
        System.err.println("Enter the Base Value:");
        int Base = sc.nextInt();
        sc.close();
        Converter(DecimalNum,Base);
    }
}
