package String;

import java.util.Arrays;

public class ReverseStringArray1 {
    public static void main(String[] args) {
        String s="You all are very very good student";
        String[] s1=s.split(" ");
        for (int i=0;i<s1.length;i++)
        {
            char[] c=s1[i].toCharArray();
            String s2="";
            for (int j=c.length-1;j>=0;j--)
                s2+=c[j];
            s1[i]=s2;

           System.out.print(s2+" ");

        }
        System.out.println();
        System.out.println(Arrays.toString(s1));//print using arrays
    }
}
