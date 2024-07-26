public class inheritance {

    static class A 
    {
       public void get()
        {
            System.out.println("A Hello");
        }
    }

    static class B extends A{
       public void put()
        {
            System.out.println("B Class ");
        }
    }

    public static void main(String[] args) {
        B k=new B();
        k.get();
        k.put();
    }
    
}
