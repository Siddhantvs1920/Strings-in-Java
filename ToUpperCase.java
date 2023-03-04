package String;

public class ToUpperCase {
    public static void main(String[] args) {
        String s="abcdeD";
        System.out.println(s.toUpperCase());
        String p=myUpper(s);
        System.out.println(p);
    }

    private static String myUpper(String s) {
        String s1="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch>='a'&&ch<='z')
            {
                char temp=(char)(ch-32);
                s1=s1+temp;

            }
            else
                s1=s1+ch;
        }
        return s1;
    }
}
