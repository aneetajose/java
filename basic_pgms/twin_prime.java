import java.util.*;
public class twin_prime 
{
    int prime(int n)
    {
        int i, f = 0;
        for(i = 2; i < n/2; i++)
            if(n % i == 0)
                f = 1;
        return f;
    }
    void twin(twin_prime obj)
    {
        int m, n, x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        m = in.nextInt();
        System.out.println("Enter the second number:");
        n = in.nextInt();
        x = obj.prime(m);
        y = obj.prime(n);
        if(((x == 0) && (y == 0)) && ((m - n == 2) || (n - m == 2)))
            System.out.println(m +" and "+ n +" are twin primes.");
        else
            System.out.println(m +" and "+ n +" are not twin primes.");
    }
    public static void main(String args[])
    {
        twin_prime obj = new twin_prime();
        obj.twin(obj); 
    }
}
