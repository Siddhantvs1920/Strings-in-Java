package String;

public class RemoveMultipleSpace {
    public static void main(String[] args) {
            String s="      you   are    all very very   good  student      ";
            s=s.trim();
            s=removeSpaces(s);
        System.out.println(s);

    }

    private static String removeSpaces(String s) {
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' '&&s.charAt(i+1)==' ')
            {}
            else
                s2=s2+s.charAt(i);

        }
        return s2;

    }
}
