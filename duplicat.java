import java.util.HashSet;

public class duplicat {
    public static boolean dup( int[] nums)
    {
        HashSet<Integer> seen=new HashSet<>();
        for(int ele:nums)
        {
            if(seen.contains(ele))
            {
                return true;
            }
            seen.add(ele);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,1};
        boolean a = dup(nums);
        System.out.println(a);
    }

    
}
