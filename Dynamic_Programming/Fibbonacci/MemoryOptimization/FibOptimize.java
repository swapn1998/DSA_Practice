package Dynamic_Programming.Fibbonacci.MemoryOptimization;

public class FibOptimize {

    public static void main(String[] args) {

        int prev =1;

        int prev2=0;

        for(int i=2;i<=5;i++)
        {
            int curr = prev +prev2;

            prev2 = prev;

            prev = curr;

        }

        System.out.println(prev);

    }


}
