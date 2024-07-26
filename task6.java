import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to hold salaries of 10 people
        int[] salaries = new int[10];

        // Taking input from the user
        System.out.println("Enter the salaries of 10 people:");
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = sc.nextInt();
            salaries[i]=sc.nextInt();
        }
        

         // Displaying the initial salaries
         System.out.println("\n            Initial Salaries:");
         for (int salary : salaries) {
             System.out.println(salary);
         }

        // Applying the increment conditions
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] >= 1_00_000) {
                salaries[i] += 5000;
            } else if (salaries[i] >= 50000 && salaries[i] < 80000) {
                salaries[i] += 2500;
            } else if (salaries[i] >= 80000 && salaries[i] <= 1_00_000) {
                salaries[i] += 3000;
            }
            
        }

        // Displaying the updated salaries
        System.out.println("\n       Updated Salaries:");
        for (int salary : salaries) {
            System.out.println(salary);
        }
    }
}
