public class class1{

    static class Student {
        int a, b;

        void get() {
            a = 20;
            b = 30;
        }

        void put() {
            System.out.println(a + b);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.get();
        s.put();
    }
}
