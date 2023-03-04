package String;

public class ToLowerCase {
    public static void main(String[] args) {
        String s="HEFsHINE";
        System.out.println(s.toLowerCase());
        //Method Implimentation of to lowerCse;
        System.out.println(myToLowerCase(s));
    }

    private static String myToLowerCase(String s) {
        String s1="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
                s1=s1+(char)(ch+32);
            else
                s1=s1+ch;
        }
        return s1;
    }
}
