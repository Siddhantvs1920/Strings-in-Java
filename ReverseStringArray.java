package String;

import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        String s="you are very very bad student?";
        String[] s1=s.split(" ");
        String s2="";
        int i=0;
        int j=s1.length-1;
        while (i<j)
        {
            String temp=s1[i];
            s1[i]=s1[j];
            s1[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s1));
       for (int k=0;k<s1.length;k++)
        {
            if (k < s1.length - 1)
                s2 += s1[k] + " ";
            else
                s2 += s1[k];
        }
        System.out.println(s2);
    }
}
