interface abc{// Derived 1
    void get();
    void put();
}

//Derived 2
interface def{
    void show();
    void finl();

}

interface gef{
    void ab();
    void cd();
}
public class multipl implements abc,def,gef {//base class 

    public void get()
    {
        System.out.println("ABC get function");
    }
    public void put()
    {
        System.out.println("ABC put function");
    }
    public void show()
    {
        System.out.println("DEF show Function");
    }
    public void finl()
    {
        System.out.println("DEF final function");
    }
    public void ab()
    {
        System.out.println("AB ");
    }
    public void cd()
    {
        System.out.println("CD");
    }
    public static void main(String[] args) {
        multipl m=new multipl();
        m.show();
        m.get();
        m.put();
        m.ab();
        m.cd();
    }
    
}
