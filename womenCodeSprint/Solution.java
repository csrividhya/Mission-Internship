import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }

        System.out.println("Yo1");
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(keyboards[i]<keyboards[j])
                {
                    int temp = keyboards[i];
                    keyboards[i]=keyboards[j];
                    keyboards[j]=temp;
                }
             
        
        
        for(int i=0;i<m;i++)
            for(int j=0;j<m;j++)
                if(pendrives[i]<pendrives[j])
                {
                    int temp = pendrives[i];
                    pendrives[i]=pendrives[j];
                    pendrives[j]=temp;
                }
             
        if(pendrives[0]+keyboards[0]>s)
            System.out.println("-1");

             
        
    }
}

