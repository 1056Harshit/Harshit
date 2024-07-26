
import java.util.Scanner;

public class divisble {
    
    public static void main(String[] args) {
        int a,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        a=sc.nextInt();

        System.out.println("Enter the Second Number : ");
        n=sc.nextInt();

        while(a<=n)
        {
            if(a%2==0 && a%4!=0)
            {
                System.out.println("Digits Divisible by 2 not by 4 are :  " +" "+  a );
            }
            a++;
        }
    }
}
