class A{
    String color="WHite";
}
class B extends A{
    String color="Black";
    void printcolor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}

class Tesuper{
    public static void main(String[] args) {
        B n=new B();
        n.printcolor();
    }
}