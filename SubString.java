package String;

public class SubString {
    public static void main(String[] args) {
        String s="Hefshine";
        System.out.println(s.substring(4));
        System.out.println(mySubString(0,4,s));
    }

    private static String mySubString(int i, int j, String s) {
        String s1="";
        for (int k=i;k<j;k++)
            s1=s1+s.charAt(k);
        return s1;
    }
}
