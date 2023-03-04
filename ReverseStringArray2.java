package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseStringArray2 {
    public static void main(String[] args) {
        String s="dard dilo ke kum ho jate";
        String[] sa=s.split(" ");
        for (int i=0;i<sa.length;i++)
        {
            char[] c=sa[i].toCharArray();
            String s2="";
            for (int j=c.length-1;j>=0;j--)
                s2=s2+c[j];
            sa[i]=s2;
        }
        System.out.println(Arrays.toString(sa));

    }
}
