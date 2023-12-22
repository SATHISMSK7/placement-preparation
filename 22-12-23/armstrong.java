import java.util.Scanner;
class armstrong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=n;
int n2=n;
int d=1;
while(n1!=0)
{
n1/=10;
d++;
}

System.out.println(d);
}
}