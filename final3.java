final class final3 {
    void get()
    {
        System.out.println("Final3 Class");
    }
}

class A extends final3{
    void get()
    {
        System.out.println(" A class");
    }

    public static void main(String[] args) {
        A t=new A();
        t.get();
    }
}
