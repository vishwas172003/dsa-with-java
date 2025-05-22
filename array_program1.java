import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class array_program1 {
    public static int [] array_program(int[] nums,int traget)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int x = traget - nums[i];
            if(map.containsKey(x))
            {
                return new int[] {map.get(x),i};

            }
            map.put(nums[i], i);

        }
        return new int[] {};

    }
    
}
public static void main (String[] agrs)
{
    int [] nums = {2,7,11,3,4};
    int target = 7;
    System.out.println(Arrays.toString(array_program(nums, target)));
}