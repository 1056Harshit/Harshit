interface abc
{
    void print();
    
}
interface xyz
{
    void show();
}
class student implements abc,xyz
{
    public void print()
    {
        System.out.println("Hello ");
    }
    public void show()
    {
        System.out.println("Welcome ");
    }

    public static void main(String[] args) {
        student obj=new student();
        obj.show();
        obj.print();
    }
}