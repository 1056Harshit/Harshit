
import java.util.Scanner;

public class SumDgt {

    public static void main(String[] args) {
        
        int n,digit,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber : ");
        n=sc.nextInt();

        while(n > 0)  
        {  
        //finds the last digit of the given number   
        System.out.println("n "+ n); 
        digit = n % 10;  
        //adds last digit to the variable sum 
        System.out.println("digit "+ digit); 
        sum = sum + digit;  
        //removes the last digit from the number
        
        System.out.println("n is  :"+ n);
        n = n / 10;  
        }  
        //prints the result  
        System.out.println("Sum of Digits: "+sum);  
    }  
} 
