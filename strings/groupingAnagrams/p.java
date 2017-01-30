import java.io.*;
import java.util.*;

public class p 
{

    public static HashMap<Character, Integer> generateHashMap(String s)
    {
        int len = s.length();
        HashMap <Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<len;i++)
        {
            if(map.containsKey(s.charAt(i))==false)
                map.put(s.charAt(i),1);
            else
            {
                char temp = s.charAt(i);
                map.put(temp,(map.get(temp)+1));
            }
        }
        
        return map;
    }
    
    public static boolean checkEquality(HashMap<Character,Integer>a,HashMap<Character,Integer> b)
    {
        if(a.equals(b) && a.size()==b.size())
            return true;
        else
            return false;
    }
    
    public static void group(String[] s, ArrayList<HashMap<Character,Integer>> a)
    {
     int lnum = a.size();
     int k=0;

     HashMap hs = new HashMap<Integer,Integer>();

     for(int i=0;i<lnum;i++)
     {
        hs = new HashMap<Integer,Integer>();

        for(int j=0;j<lnum;j++)
        {
            if(i!=j && checkEquality(a.get(i),a.get(j)) ==true && hs.containsKey(i)==false && hs.containsKey(j)==false)
            {
                hs.put(i,i);
                hs.put(j,j);
            }
        }

    for(int x=0;x<hs.size();x++)
    {
        int oo = (int) hs.get(x) ;
        System.out.print(s[oo]);
    }
    System.out.println("-------------");
    }

    
} 


public static void groupAnagrams(String[] strs) 
{

    int numOfStr = strs.length;

    ArrayList<HashMap<Character,Integer>> map = new ArrayList<HashMap<Character,Integer>>();

    for(int i=0;i<numOfStr;i++)
    {
        map.add(i,generateHashMap(strs[i]));
    }

    group(strs,map);
}

public static void main(String[] args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter num of strings: ");
    int x = s.nextInt();
    String[] a= new String[x];
    System.out.println("Enter strings: ");
    for(int i=0;i<x;i++)
        a[i]=s.next();

    groupAnagrams(a);
}

}