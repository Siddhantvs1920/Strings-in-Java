package String;

public class ReverseString {
    public static void main(String[] args) {
        String s="You all are very very good Students";
        String[] t=s.split(" ");
        for (int k=0;k<t.length;k++) {
            String p = t[k];
            char[] cp = p.toCharArray();
            int i = 0;
            int j = cp.length - 1;
            while (i < j) {
                char temp = cp[i];
                cp[i] = cp[j];
                cp[j] = temp;
                i++;
                j--;
            }
            String q = new String(cp);
            t[k] = q;
        }
        System.out.println();
        for (String data:t)
            System.out.print(data+" ");
        System.out.println();

        String[] sa=s.split(" ");
        int i=0;
        int j=sa.length-1;
        while (i<j)
        {
            String temp=sa[i];
            sa[i]=sa[j];
            sa[j]=temp;
            i++;
            j--;

        }
        for (String data:sa)
            System.out.print(data+" ");
        for (int k=0;k<sa.length;k++) {
            String p = sa[k];
            char[] ca = p.toCharArray();
            i = 0;
            j = ca.length - 1;
            while (i < j) {
                char temp = ca[i];
                ca[i] = ca[j];
                ca[j] = temp;
                i++;
                j--;
            }
            String q = new String(ca);
            sa[k] = q;
        }
        System.out.println();
            for (String data:sa)
                System.out.print(data+" ");


    }
}
