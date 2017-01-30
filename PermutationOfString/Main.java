import java.io.*;
import java.util.*;

public class Main
{
    public static ArrayList<String> permute(String a)
    {
        ArrayList<String> temp = new ArrayList<String>();

        if(a.length()==1)
            temp.add(a);
        else if(a.length()>1)
        {
            char first = a.charAt(0);
            String rest = a.substring(1,a.length());
            temp = merge(permute(rest),first);
        }//elif
        return temp;
    }//eof

    public static ArrayList<String> merge(ArrayList<String> list, char first)
    {
        ArrayList<String> temp = new ArrayList<String>();
        for(String w: list)
        {
            for(int i=0;i<=w.length();i++)
            {
                String ans = new StringBuffer(w).insert(i,first).toString();
                temp.add(ans);
            }
        }
    return temp;
    }
    public static void main(String args[])
    {
        System.out.println("Enter string to be permuted: ");
        Scanner s = new Scanner(System.in);
        String a = s.next();

        ArrayList<String> answer = permute(a);

        System.out.println("Permutations of "+a+" are: \n");
        for(String w:answer)
        {
            System.out.println(w);
        }
    }
}