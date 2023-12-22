import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char a[]=s1.toCharArray();
        int uc=0,lc=0,sc=0,n=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>='0' && a[i]<='9')
            n++;
            else if(a[i]>='A' && a[i]<='Z')
            uc++;
            else  if(a[i]>='a' && a[i]<='z')
            lc++;
            else
            sc++;
        }
        if((a.length<16 && a.length>=8) && uc>0 && lc>0 && sc>0 && n>0)
        System.out.print(s1+" is a valid password");
        else
        System.out.print(s1+" is a invalid password");
    }
}
