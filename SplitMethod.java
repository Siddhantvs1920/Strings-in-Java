package String;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String s1="you all are very bad Student";
        char c=' ';
        int size=sizeOfArray(s1,c);
        String[] sa= new String[size];
        //System.out.println(Arrays.toString(newArray(s1,sa)));
        String s2="";
        int index=0;
        for (int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=c)
                s2=s2+s1.charAt(i);
            else
            {
                sa[index++]=s2;
            s2="";}
        }
         sa[index]=s2;
        System.out.println(Arrays.toString(sa));

    }

    private static int sizeOfArray(String s1, char c) {
        int count=1;
        for (int i=0;i<s1.length();i++)
            if(s1.charAt(i)==c)
                count++;
        return count;
    }
}
