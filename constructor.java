

public class constructor {

     static class student 
    {
        int a,b;
        student(int x,int y)
        {
            a=x;
            b=y;
            System.out.println(a+b);
        }
        public static void main(String[] args) {
            student s=new student(12, 45);
        }
    }
    
}
