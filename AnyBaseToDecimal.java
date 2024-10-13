import java.util.*;
public class AnyBaseToDecimal {

    static void Converter(int Num,int Base){
        double res = 0;
        int power =0;
        while(Num>0){
            int unitDigit = Num%10;
            Num= Num/10;
            res=res+unitDigit*Math.pow(Base,power);
            power++;

        }

        System.out.println("Result is :"+(int) res);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int Num = sc.nextInt();
        System.err.println("Enter the Base Value:");
        int Base = sc.nextInt();
        sc.close();
        Converter(Num,Base);
    }
}
