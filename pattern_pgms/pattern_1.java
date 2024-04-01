package pattern_pgms;

public class pattern_1 {
    public static void main(String args[])
    {
        String s = "ABCDE";
        for(int i = s.length(); i > 0; i--)
            System.out.println(s.substring(0, i));
    }
}
