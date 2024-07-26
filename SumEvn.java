
import java.util.Scanner;
public class SumEvn {



    public static void main(String[] args) {

        //int a,n;//variable initialize 

        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Enter the First Number : ");
       int a=sc.nextInt();

        System.out.println("Enter the Second Number : ");
       int n=sc.nextInt();

        int sum = 0,sum1=0;
        for (int i = a; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i; // Add the even number to the sum
            }
            else if(i%2==1)
            {
                sum1 +=i;
            }
        }

        // Display the result
        System.out.println("The sum of even numbers between 20 and 80 is: " + sum);

        System.out.println("The sum of odd numbers between 20 and 80 is : "+ sum1);
        
    }

}
    
