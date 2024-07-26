
import java.util.Scanner;

public class tskk4 {

    public static void main(String[] args) {
        //Scanner class to take input from the user 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Salary : ");
        int salary= sc.nextInt();

        //condition applied
        if (salary > 1_00_000 ) {
            salary += 5000;//Increment the salary by 5000
        } else if (salary >= 80000 && salary< 1_00_000) {
            salary += 3000;//Increment the salary by 3000
        } else if (salary >= 50000 && salary < 80000) {
            salary += 2500;//Increment the salary by 2500
        }
        
        else{
            System.out.println("The Employee is not Eligible for the Increment .");
        }

        System.out.println("The updated salary is: " + salary);
    }
    
}
