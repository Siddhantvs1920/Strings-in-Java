package String;

public class EqualTo {
    public static void main(String[] args) {
        String s="abcd";
        String s1="acd";
        System.out.println(s.equals(s1));
        System.out.println(tellEqual(s,s1));
    }
     private static boolean tellEqual(String s, String s1) {
        if (s.length()==s1.length())
        {
            for (int i=0;i<s.length();i++)
                if(s.charAt(i)!=s1.charAt(i))
                    return false;
            return true;
        }
           return false;
    }
}
