import java.util.*;
public class Main
{
    static void insert(char c)
    {
        if(c!=' ')
        {
            st.push(c);
        }
        else
        {
            while(!st.empty())
            {
                System.out.print(st.peek());
                st.pop();
            }
            System.out.print(' ');
        }
    }
	public static void main(String[] args) {
		static Stack<Character> st=new Stack<>();
		Main m=new Main();
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		for(int i=0;i<s1.length();i++)
		{
		    m.insert(s1.charAt(i));
		}
		
	    
	}
}
