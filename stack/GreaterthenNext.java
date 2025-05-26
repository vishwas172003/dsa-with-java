import java.util.*;

public class GreaterthenNext {
    public static int[] isGreater(int []nums)
    {
        int n = nums.length;
        int[] result =new int[n];
        Stack<Integer> stack =new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()])
            {
                int index=stack.pop();
                result[index] = nums[i];

            }
            stack.push(i);

        }
        while(!stack.isEmpty())
        {
            result[stack.pop()]=-1;
        }
        return  result;
            
        }
        public static void main(String[] args) {
            int[] nums = {2,1,2,3,4};
            System.out.println(Arrays.toString(nums));
        }
}
