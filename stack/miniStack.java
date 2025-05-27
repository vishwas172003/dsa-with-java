
import java.util.Stack;

class miniStack {
    private  Stack<Integer> mainstack =new Stack<>();
    private  Stack<Integer> ministack =new Stack<>();

    public miniStack()
    {
        mainstack = new  Stack<>();
        ministack =new Stack<>();
    }

    public void push(int val)
    {
        mainstack.push(val);

        if(ministack.isEmpty() || val <= ministack.peek());
        {
            ministack.push(val);
        }
        ministack.push(ministack.peek());
    }
    public void pop()
    {
        mainstack.pop();
        ministack.pop();
    }

    public int top(){
        return ministack.peek();
    }
    public int getMin()
    {
        return ministack.peek();

    }


    public static void main(String[] args) {
        miniStack min =new miniStack();
        min.push(4);
        min.push(5);
        min.push(2);

        System.out.println(""+min.getMin());
        min.pop();
        System.out.println(""+min.getMin());
        System.out.println(""+min.top());
    }
    
}