package String;

public class CompareToMethod {
    public static void main(String[] args) {
        String s1="hefshine";
        String s2="hefshine Software";
        System.out.println(s1.compareTo(s2));
        System.out.println(myCompareTo(s1,s2));
    }

    private static int myCompareTo(String s1, String s2) {
        for (int i=0;i<s1.length()&&i<s2.length();i++)
            if(s1.charAt(i)!=s2.charAt(i))
                return s1.charAt(i)-s2.charAt(i);
        return s1.length()-s2.length();
    }
}
