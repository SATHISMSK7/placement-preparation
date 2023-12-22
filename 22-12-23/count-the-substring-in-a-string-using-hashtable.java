import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String []s1=s.nextLine().split(" ");
        Hashtable <String,Integer>ht=new Hashtable<>();
        for(int i=0;i<s1.length;i++)
        {
            if(ht.containsKey(s1[i]))
            {
                int k=ht.get(s1[i])+1;
                ht.put(s1[i],k);
            }
            else
            {
                ht.put(s1[i],1);
            }
        }
        Set<String>st=new HashSet<String>();
        st=ht.keySet();
        
        for(String i:st)
        System.out.println(i+" -> "+ht.get(i));
        /*while(enu.hasMoreElements())
        {
            enu.nextElement();
            System.out.print(k+" -> "+ht.get(y));
        }*/
        
    }
}