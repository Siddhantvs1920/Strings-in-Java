package String;

public class PalindromeString {
    public static void main(String[] args) {
        String s="nitina";
        String s1="";
        for (int i=s.length()-1;i>=0;i--)
             s1=s1+s.charAt(i);
        if (s.equals(s1))
            System.out.println("Palondrome");
        else
            System.out.println("not");
        //Using method to find palindrome or not
        if (tellMeP(s))
            System.out.println("Palondrome");
        else
            System.out.println("not");

    }

    private static boolean tellMeP(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j)
        {
            if (s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;

    }
}
