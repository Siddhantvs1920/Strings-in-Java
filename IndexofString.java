package String;

public class IndexofString {
    public static void main(String[] args) {
        String s1="abdfencsdfabandrgv";
        String s2="df";
        int index=s1.indexOf(s2);
        System.out.println(index);
        //Implimantation of Index of Method;
        System.out.println(indexImplimantation(s1,s2));

    }

    private static int indexImplimantation(String s1, String s2) {
        if(s2=="")
            return 0;
        for(int i=0;i<=s1.length()-s2.length();i++)
        {
            if(s2.charAt(0)==s1.charAt(i))
            {
               int s1Index=i;
                int s2Index=0;
                int count=0;
                while (s2Index<s2.length())
                {
                    if(s1.charAt(s1Index)!=s2.charAt(s2Index)) {
                        count++;
                        break;
                    }
                    else
                        s1Index++;
                        s2Index++;
                }
                if(count==0)
                    return i;

            }
        }
        return -1;
    }
}
