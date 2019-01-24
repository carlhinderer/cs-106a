import acm.program.*;

public class PerfectNumbers extends ConsoleProgram {
    private static final int TESTING_RANGE_MIN = 1;
    private static final int TESTING_RANGE_MAX = 99999;
    
    public void run() {
        println("Perfect Numbers:");
        for(int i=TESTING_RANGE_MIN; i <= TESTING_RANGE_MAX; i++) {
            if(isPerfect(i)) {
                println(i + " is perfect!");
            }
        }
        println("Done...");
    }
    
    private boolean isPerfect(int n) {
        int factorSum = 0;
        int startingFactor = n / 2;
        for (int i=startingFactor; i>0; i--) {
            if(n % i == 0) {
                factorSum += i;
            }
        }
        return n == factorSum;
    }
}
