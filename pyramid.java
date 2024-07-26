import java.util.Scanner;


public class pyramid {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number of terms: ");
        int n=sc.nextInt();

        System.out.println("Entered Pyramid Terms are :");
        for( int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i + " " );
            }
            System.out.println();
        }

    }
    
}
