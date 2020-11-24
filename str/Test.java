package str;

public class Test {
public static void main(String args[]) throws InterruptedException {
        

        int[] array = {7, 2, 1, 5, 4 };
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(array);
        

        ctx = new Context(new QuickSort());
        ctx.arrange(array);
	

    }

}
