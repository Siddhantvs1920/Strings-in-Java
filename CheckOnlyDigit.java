package String;

public class CheckOnlyDigit {
    public static void main(String[] args) {
        String s = "1234";
        char[] ch = s.toCharArray();
        int count=0;
        for (int i = 0; i < s.length(); i++)
        {
            if (ch[i]< '0' && ch[i]> '9')
                count++;
        }
        if(count==s.length())
            System.out.println("Only digits");
        else
            System.out.println("Not only Digit");
    }
}
