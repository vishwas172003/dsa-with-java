import java.util.*;
 class inserction{
    public static void print_array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array limit");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter ther array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int current = arr[i];
            int j = i-1;
            while (j>=0&& current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        print_array(arr);
    }
 }
