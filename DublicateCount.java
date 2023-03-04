package String;

public class DublicateCount {
    public static void main(String[] args) {
        String s="aaababbbbcccceddde";
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            if(unikCount(s,i)==false)
            {
                count++;
                System.out.print(s.charAt(i)+" ");
            }
        }
        System.out.println("\n"+count);
    }

    private static boolean unikCount(String s, int i) {
        for (int j=0;j<i;j++)
        {
            if(s.charAt(j)==s.charAt(i))
                return false;
        }
        return true;
    }
}
