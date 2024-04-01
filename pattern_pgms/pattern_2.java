package pattern_pgms;

public class pattern_2 
{
    public static void main(String args[])
    {
        String s = "BLUE";
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = 0; j <= i; j++)
                System.out.print(s.charAt(i));
            System.out.println();
        }
    } 
}
