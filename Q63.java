//Q63] WAP to print the perfect squares between the range m & n
import java.util.Scanner;
class Q63
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lower range number");
        int m=sc.nextInt();
        System.out.println("Enter highe range number");
        int n=sc.nextInt();
        for (int j=m;j<=n;j++)
        {
            boolean b= false;
            for(int i=1;i<=j;i++)
            {
                if(i*i==j)
                {
                    b=true;
                    break;
                }
            }
            if(b==true)
            {
                System.out.println(j);
            }
        }
    }
}