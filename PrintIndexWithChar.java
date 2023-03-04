package String;

import java.io.StringBufferInputStream;

public class PrintIndexWithChar {
    public static void main(String[] args) {
        String s="abcdef";
        for (int i=0;i<s.length();i++)
            System.out.println(s.charAt(i)+" "+i);
    }
}
