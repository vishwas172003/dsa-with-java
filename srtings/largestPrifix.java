package srtings;

public class largestPrifix {
    public static String largestprifix(String[] s) {
        if (s.length==0 || s == null) return "the string is in valid";

        for(int i=0;i<s[0].length();i++)
        {
            char ch = s[0].charAt(i);

            for(int j=1;j<=s.length;j++)
            {
                if(i>=s[j].length() || s[j].charAt(i) != ch)
                {
                    return s[0].substring(0,i);
                }

            }

        }
        return s[0];
        
    }
    public static void main(String[] args) {
        String[] s = {"fixable","five","fight"};
        System.out.println(""+largestprifix(s));
    }
    
}
