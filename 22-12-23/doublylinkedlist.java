import java.util.*;
class node {
    int data;
    node next;
	node prev;
    node(int d)
    {
        data=d;
        this.next=null;
	this.prev=null;
    }
}

public class dlist
{
    static node head=null;
	static node tail=null;
    public static void insert(int d)
    {
        node n=new node(d);
        if(head==null)
        {
            head=n;
		tail=n;
        }
        else{
		
            tail.next=n;
		n.prev=tail;
		tail=n;
tail.next=null;
        }
    }
    public static void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
    }
    public static void reverse()
	{
	node temp=tail;
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.prev;
}
}
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    insert(s.nextInt());
		}
		display();
		System.out.println();
		reverse();
	}
}
