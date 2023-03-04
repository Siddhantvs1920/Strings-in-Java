package String;

public class RemoveSpecific {
    public static void main(String[] args) {
        String s="acDsafsac";
        char ch='a';
        String s1="";
        for (int i=0;i<s.length();i++)
            if(s.charAt(i)!=ch)
                s1=s1+s.charAt(i);
        System.out.println(s1);
    }
}
