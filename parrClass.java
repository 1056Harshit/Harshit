public class parrClass {

   static  class student 
    {
        
    int a,b;
    void get(int x,int y)
    {
        a=x;
        b=y;
    }
    void put()
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        student s= new student();
        s.get(20, 50);
        s.put();
    }

    }
    
}
