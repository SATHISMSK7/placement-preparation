import java.util.*;

class node
{

  int date;

  int month;

  int year;

  node next;

    node (int d, int m, int y)
  {

    date = d;

    month = m;

    year = y;

    next = null;

  }
}
class Main
{

  static node head = null;

  public static void insert (int d,int m,int y)
  {
      node n=new node(d,m,y);


    if (head == null)

      {

	head = n;

      }

    else

      {

	n.next = head;

	head = n;

      }

  }

  public static void ssort (node h)
  {

    node slist = null;

    node tail = null;


    if (h == null || h.next == null)
    {
      System.out.println(h.date+" "+h.month+" "+h.year+" ");
     return;
    }


    while (h != null)

      {

	node cn = h;

	node pn = null;

	node minpre = null;

	node min = h;

	while (cn != null)

	  {

	    if (comparedate (cn, min) < 0)

	      {

		minpre = pn;

		min = cn;

	      }

	    pn = cn;

	    cn = cn.next;

	  }


	if (minpre != null)

	  {

	    minpre.next = min.next;

	  }

	else

	  {

	    h = h.next;

	  }

	if (slist == null)

	  {

	    slist = min;

	  }

	else

	  {

	    tail.next = min;

	  }

	tail = min;

	min.next = null;

      }



    node temp = slist;

    while (temp != null)

      {

	System.out.println (temp.date + " " + temp.month + " " + temp.year +" ");

	temp = temp.next;

      }

  }

  public static int comparedate (node d1, node d2)
  {

    if (d1.year != d2.year)

      return d1.year - d2.year;

    else if (d1.month != d2.month)

      return d1.month - d2.month;



    return d1.date - d2.date;

  }







  public static void main (String[]args)
  {

    Scanner s = new Scanner (System.in);

    int n = s.nextInt ();

    for (int i = 1; i <= n; i++)

      {

	int d = s.nextInt ();

	int m = s.nextInt ();

	int y = s.nextInt ();

	insert (d, m, y);

      }
    ssort (head);

  }
}
