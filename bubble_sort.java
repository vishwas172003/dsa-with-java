import java.util.*;
class bubble_sort {
    public static void print_array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the limit for the array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the arry elemnts to sort");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

        }
        print_array(arr);
    }

    
}
