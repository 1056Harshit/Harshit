public class multilevel {
    
    static class A 
    {
        void get()
        {
            System.out.println("A Hello");
        }
    }

    static class B extends A{
        void put()
        {
            System.out.println("B Class ");
        }
    }

    static class C extends B{
        void show()
        {
            System.out.println("C Class ");
        }
    }

    public static void main(String[] args) {
        C k=new C();
        k.get();
        k.put();
        k.show();
    }
}
