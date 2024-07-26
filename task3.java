public class task3 {
    
    public static void main(String[] args) {
        int n,a=10,b=20,c,d,e,f,g,h,year=2024;

        switch(n=3)
        {
            case 1:
                c=a+b;
                System.out.println(c + " : c");
                
                d=a-b;
                System.out.println(d + " : d");

                e=a*b;
                System.out.println(e + " : e");

                f=a/b;
                System.out.println(f + " : f");

                g=a%b;
                System.out.println(g + " : g");
                break;

        case 2:
                if(a%b==0)
                {
                    System.out.println("a is even");
                }
                else 
                {
                    System.out.println("a is odd");
                }
                break;

        case 3:
                if(year%4==0)
                {
                    System.out.println(year+ " is a leap year ");
                }
                else{
                    System.out.println(year + " is not a leap year " );
                }
                break;

        default:
        System.out.println("Invalid ");        
        }




    }
}
