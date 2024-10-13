import java.util.*;

class DecimalToBinary{

    static void Converter(int DecimalNum){

        double res =0;
        int power =0 ;
        while(DecimalNum>0){
            int rem = DecimalNum%2;
            DecimalNum= DecimalNum/2;
            res =  res + rem*Math.pow(10 ,power);
            power++;
        }
        System.err.println("Result is ="+(int) res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number:");
        int DecimalNum = sc.nextInt();
        sc.close();
        Converter(DecimalNum);
    }
}