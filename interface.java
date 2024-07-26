interface abc
{
    void get();
    
    class A implements abc
    {
        public void get()
        {
            System.out.println("A class ");
        }
    }

    public static void main(String[] args) {
        A k=new A();
        k.get();
    }
}