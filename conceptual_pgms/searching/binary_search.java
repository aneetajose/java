package conceptual_pgms.searching;

import java.util.*;

public class binary_search 
{
    void search(int arr[], int start, int end, int key)
    {
        int flag = 0;
        if(end >= start)
        {
            int mid = (start + end) / 2;
            if(arr[mid] == key)
                flag = 1;
            else if(arr[mid] > key)
                search(arr, start, mid - 1, key);
            else if(arr[mid] < key) 
                search(arr, mid + 1, end, key);
        }
        if(flag == 1)
            System.out.println("The number "+ key +" is present.");
        else
            System.out.println("The number "+ key +" is not present.");
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int i, key;
        int arr[] = new int[10];
        System.out.println("Enter the array elements:");
        for(i = 0; i < 10; i++)
            arr[i] = in.nextInt();
        Arrays.sort(arr);
        System.out.print("Enter the element to be searched: ");
        key = in.nextInt();

        binary_search ob = new binary_search();

        ob.search(arr, 0, 10, key);
    }
}
