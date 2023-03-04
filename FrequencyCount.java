package String;

public class FrequencyCount {
    public static void main(String[] args) {
        String s = "aaaabbbbcdbebbddddeee";
        for (int i = 0; i < s.length(); i++)
            if (getUnikChar(s, i))
                System.out.println(s.charAt(i) + " " + getFrequency(s, s.charAt(i)));

    }

    private static int getFrequency(String s, char ch)
    {
        int count=0;
            for (int i=0;i<s.length();i++)
            if (s.charAt(i) == ch) ;
                count++;
                return count;
    }

    private static boolean getUnikChar(String s, int i)
    {
        for (int j=0;j<i;j++)
            if(s.charAt(j)==s.charAt(i))
                return false;
        return true;
    }
}
