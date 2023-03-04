package String;

public class EndWith {
        public static void main(String[] args) {
            String s="abcdeh";
            String s1="cdeh";
            //inbuild method of string.
            System.out.println(s.endsWith(s1));
            //Implentation of Endswith method.
            System.out.println(tellMe(s,s1));
        }

        private static boolean tellMe(String s, String s1) {
            if(s1.length()<=s.length()){
                int sIndex=s.length()-1;
                int s1Index=s1.length()-1;
                while(s1Index>=0)
                {
                    if(s.charAt(sIndex)!=s1.charAt(s1Index))
                        return false;
                    else
                        sIndex--;
                    s1Index--;
                }
                return true;
            }
            else
                return false;

        }
    }


