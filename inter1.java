interface abc{
    void get();
}

interface def{
    void put();
    void show();
}

interface gef extends abc,def{
    void res();
}

class test implements gef{

    public void get()
    {
        System.out.println("ABC InterFace");
    }
    public void put()
    {
        System.out.println("DEF Interface");
    }
    public void show()
    {
        System.out.println("DEF part2 interface");
    }

    public void res()
    {
        System.out.println("Final Result");
    }

    void work()
    {
        get();
        show();
        put();
        res();
    }
}


public class inter1 extends test  {
    public static void main(String[] args) {
        test S=new test();
        S.work();
        
    }

    
}
