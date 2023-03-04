package String;

public class LastIndexOf {
    public static void main(String[] args) {
        String s1="aabcbcdfacabcdab";
        String s2="abc";
        int index=s1.lastIndexOf(s2);
        System.out.println(index);
        //Implimantation of lastIndexOf Mathod;
        System.out.println(indexImplimantation(s1,s2));
    }
    private static int indexImplimantation(String s1, String s2) {
        if(s2=="")
            return s1.length();
        int lastIndex=-1;
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
                    lastIndex = i;

            }
        }
        return lastIndex;
    }
}
