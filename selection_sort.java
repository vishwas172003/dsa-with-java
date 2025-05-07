import java.util.*;
class selection_sort{
    public static void print_array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit of the array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elemnts");
        for(int i=0;i<arr.length;i++){
             arr[i]= sc.nextInt();
        }
        for(int i=0 ; i<arr.length-1;i++){
            int smallest = i;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        print_array(arr);



    }
}