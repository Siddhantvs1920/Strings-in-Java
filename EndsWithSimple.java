package String;

public class EndsWithSimple {
    public static void main(String[] args) {
        String s="hefshine";
        String s1="shine";
        System.out.println(s.endsWith(s1));
        //Implimentation of end with method
        System.out.println(myEndsWith(s,s1));
    }

    private static boolean myEndsWith(String s, String s1) {
        if(s1.length()>s.length())
            return false;
        int i=s.length()-1;
        int j=s1.length()-1;
        while (j>=0)
        {
            if(s.charAt(i)!=s1.charAt(j))
                return false;
            i--;
            j--;
        }
        return true;
    }
}
