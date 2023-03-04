package String;

public class RemoveExteaSpaces {
    public static void main(String[] args) {
        String s="    sdfsa  sdf sdfsa     dfsjlf      ";
        String s1="";
        for (int i=0;i<s.length()-1;i++)
        {
            if (s.charAt(i)==' '&&s.charAt(i+1)==' ')
            {
            }
            else
                s1+=s.charAt(i);
        }
        System.out.println(s1);
    }
}
