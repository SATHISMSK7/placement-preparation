import java.util.*;
class node {
    int data;
    node next;
    node(int d)
    {
        data=d;
        this.next=null;
    }
}

public class llist
{
    static node head=null;
    public static void insert(int d)
    {
        node n=new node(d);
        if(head==null)
        {
            head=n;
        }
        else{
            n.next=head;
            head=n;
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
    
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    insert(s.nextInt());
		}
		display();
	}
}
