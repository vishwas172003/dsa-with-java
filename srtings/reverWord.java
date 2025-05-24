package srtings;

public class reverWord {
    public static String reversword(String s) {
        s.trim();

        String[] word = s.split("\\s+");

        StringBuilder revers =new StringBuilder();

        for(int i= word.length-1;i>=0;i--)
        {
            revers.append(word[i]);
            if(i!=0)
            {
                revers.append(" ");
            }
        }
        return revers.toString();
        
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        String a = reversword(s);
        System.out.println(""+reversword(s));

    }
    
}
