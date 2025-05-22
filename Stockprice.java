import java.util.*;
public class Stockprice {
    public static int stockPrice(int[]prices) 
    {
        int min =Integer.MAX_VALUE;
        int max =0;
        for(int price :prices )
        {
            if(price<min)
            {
                min=price;
            }
            else
            {
                int profit=price-min;
                max = Math.max(max, profit);
            }

        }
        return max;

    
}
public static void main(String[] args) {
    int[] prices={7, 1, 5, 3, 6, 4};
    System.out.println("Maximum Profit: " + stockPrice(prices));

}
}
