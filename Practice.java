package String;

public class Practice {
        public static void main(String[] args) {
            String s1="aabcbcdfacabcdab";
            String s2="ab";
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
                    for (int j=i;j<s2.length();j++)
                    {
                        if(s1.indexOf(j)!=s2.charAt(s2Index))
                            count++;
                        else
                            s2Index++;
                    }

                    if(count==0)
                        lastIndex = i;

                }
            }
            return lastIndex;
        }
    }


