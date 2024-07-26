public class paramet {

    static class Student {
        // Default constructor
        Student() {
            System.out.println("Hello");
        }

        // Constructor with one parameter
        Student(int x) {
            System.out.println(x + x);
        }

        // Constructor with two parameters
        Student(int x, int y) {
            System.out.println(x + y);
        }

        public static void main(String[] args) {
            Student s = new Student();         
            Student s1 = new Student(20,30);     
            Student s2 = new Student(20);  
        }
    }
}
