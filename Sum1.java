import java.util.Scanner;

public class Sum1{

    public static void main(String[] args) {

        int a,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        a=sc.nextInt();

        System.out.println("Enter the Second Number : ");
        n=sc.nextInt();

        int sum = 0;
        for (int i = a; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i; // Add the even number to the sum
            }
        }

        // Display the result
        System.out.println("The sum of odd numbers between 20 and 80 is: " + sum);
        
    }

}