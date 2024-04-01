import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        int i, n, c = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = in.nextInt();
        for(i = 2; i <= n/2; i = i+1)
        {
            if(n % i == 0)
                c++;
        }
        if(c == 0)
            System.out.println("The number "+ n+ " is a prime number.");
        else
            System.out.println("The number "+ n+ " is not a prime number.");
    }
}