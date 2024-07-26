public class Sumevn1 {

    public static void main(String[] args) {
        
        int sum=0;

        for(int i=20;i<=80;i++)
        {
            if(i%2==0)
            {
                sum +=i;
            }
           
        }

        System.out.println("Sum of Entered Number is : " + sum );
    }
    
}
