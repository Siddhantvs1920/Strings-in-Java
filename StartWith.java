package String;

public class StartWith {
    public static void main(String[] args) {
        String s="abcdeh";
        String s1="pqr";

        boolean ans=s.startsWith(s1);
        System.out.println(ans);
        //Implentation of Startwith method.
        System.out.println(tellMe(s,s1));
    }

    private static boolean tellMe(String s, String s1) {
        if(s1.length()>s.length())
            return false;
        for(int i=0;i<s1.length();i++)
            if(s.charAt(i)!=s1.charAt(i))
                return false;
        return true;
    }
}
