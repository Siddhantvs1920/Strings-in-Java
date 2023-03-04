package String;

public class SortingOfString {
    public static void main(String[] args) {
        String s="54132";
        char[] ch=s.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            for (int j=i+1;j<ch.length;j++)
            {
                if(ch[i]>ch[j])
                {
                    char ca=ch[i];
                    ch[i]=ch[j];
                    ch[j]=ca;
                }
            }
        }
        String s1=new String(ch);
        s=s1;
        System.out.println(s);
    }
}

