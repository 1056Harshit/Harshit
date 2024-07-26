
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        int firstVal=0,secondVal=1,thirdVal;
        // n=10

        Scanner refVal=new Scanner(System.in);
        System.out.println("Enter the Term of Fibonacci :");
        int n=refVal.nextInt();

        System.out.println("Fibonaci Series of "+ n + " is : ");
        for(int i=0;i<n;i++)
        
    {
        
        System.out.print(firstVal +" ");
        thirdVal=firstVal+secondVal;
        firstVal=secondVal;
        secondVal=thirdVal;
    }
    }
    
}
