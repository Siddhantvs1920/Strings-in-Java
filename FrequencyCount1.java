package String;


public class FrequencyCount1 {
    public static void main(String[] args) {
        String s="abdsfafdbadfsacsadfbc";
        String s1=getUnikString(s);
        System.out.println(s1);
        int max=Integer.MIN_VALUE;
        char c='a';
        for (int i=0;i<s1.length();i++) {
            char ch = s1.charAt(i);
            int count = getFrequency(ch, s);
            if (count > max) {
                max = count;
                c = ch;
            }
        }

            System.out.println(c+" "+max);


    }

    private static int getFrequency(char ch, String s) {
        int count=0;
        for (int i=0;i<s.length();i++)
            if(s.charAt(i)==ch)
                count++;
        return count;
    }

    private static String getUnikString(String s) {
        String s1="";
        for (int i=0;i<s.length();i++)
        {
            int count=0;
            for (int j=0;j<i;j++)
                if(s.charAt(i)==s.charAt(j))
                    count++;
            if (count==0)
                s1=s1+s.charAt(i);
        }
        return s1;
    }
}
