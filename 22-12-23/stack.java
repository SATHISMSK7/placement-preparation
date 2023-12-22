import java.util.*;
class stackimp
{
class stack{

int top;
static int a[];
static int size;
stack(int size)
{
top=-1;
a=new int[size];
}
}
public static void push(int v)
{
if(top==size)
{
System.out.print("Stack overflow");
}
else
{
a[++top]=v;
}
}
public static void pop()
{
if(top!=-1)
{
System.out.print("Stack underflow");
}
else
{
top--;
}
}
public static display()
{
if



