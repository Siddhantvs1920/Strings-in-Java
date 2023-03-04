package String;

public class RemoveDublicate {
    public static void main(String[] args) {
        String s="aaaaabbbbbcbbbddddddggggggfffff";
        String s1="";
        for (int i=0;i<s.length();i++)
        {
            if(iWalaElementPresentInLeft(s,i)==false)
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
    private static boolean iWalaElementPresentInLeft(String s, int i)
    {
        for(int j=0;j<i;j++)
            if(s.charAt(j)==s.charAt(i))
                return true;
        return false;
    }
}
