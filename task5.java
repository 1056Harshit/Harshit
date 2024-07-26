

public class task5 {

        public static void main(String[] args) {
            // Initializing the array with salaries of 10 people
            int[] salaries = {45000, 55000, 65000, 75000, 85000};
    
            // Displaying the initial salaries
            System.out.println("Initial Salaries:");
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
