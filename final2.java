
public class final2 {

    final void get()
    {
        System.out.println("rinning ");
    }
}

class test extends final2{
    void get()
    {
        System.out.println("Test Class");
    }

    public static void main(String[] args) {
        final2 f2=new final2();
        f2.get();
    }
}

