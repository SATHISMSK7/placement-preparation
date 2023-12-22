import java.util.*;
class Main
{
    public static void bucketsort(int a[],int max)
    {
        int b[]=new int[max+1];
        for(int i=0;i<a.length;i++)
        b[a[i]]++;
        int i=0,j=0;
        while(i<max+1)
        {
            if(b[i]==1)
            a[j++]=i;
            
            i++;
        }
        
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]={10,67,15,8,11};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            max=a[i];
        }
        bucketsort(a,max);
        for(int i:a)
        System.out.print(i+" ");
        
    }
}