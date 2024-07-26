
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        int r,sum=0,temp;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n= sc.nextInt();
      

        temp=n;
        while(n>0)
        {
        r = n % 10;
        sum=(sum*10)+r;
        n=n/10;
        }
        if(temp==sum)
    {
        System.out.println("Entered Number is Palindrome ");
    }
    else{
        System.out.println("Entered Number is not Palindrome");
    }
        

    }

    
    
}
