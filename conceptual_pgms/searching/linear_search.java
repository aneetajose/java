package conceptual_pgms.searching;

import java.util.Scanner;

public class linear_search 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int i, flag = 0, key;
        int m[] = new int[10];
        System.out.println("Enter the array elements:");
        for(i = 0; i < 10; i++)
            m[i] = in.nextInt();
        System.out.print("Enter the element to be searched: ");
        key = in.nextInt();
        for(i = 0; i < 10; i++)
            if(m[i] == key)
                flag = 1;
        if(flag == 1)
            System.out.println("The number "+ key +" is present.");
        else
            System.out.println("The number "+ key +" is not present.");
    }   
}
