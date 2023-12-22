import java.util.*;
class Main{
    public static int pas(int n,int r)
    {
        long out=1;
        for(int i=0;i<r;i++)
        {
            out=out*(n-i);
            out=out/(i+1);
        }
        return (int)out;
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                System.out.print(1+" ");
                
                else
                System.out.print(pas(i-1,j-1)+" ");
                
            }
            System.out.println();
        }
    }
}