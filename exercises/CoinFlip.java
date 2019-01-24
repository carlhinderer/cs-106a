import acm.program.*;
import acm.util.*;

public class CoinFlip extends ConsoleProgram {
    private RandomGenerator rgen = RandomGenerator.getInstance();
    
    public void run() {
        int flips = 0;
        int consecutiveHeads = 0;
        while(consecutiveHeads < 3) {
            String flip = coinFlip();
            println(flip);
            flips++;
            if(flip == "Heads") {
                consecutiveHeads++;
            } else {
                consecutiveHeads = 0;
            }
        }
        println("It took " + flips + " flips to get 3 consecutive heads.");
    }
    
    private String coinFlip() {
        int flip = rgen.nextInt(1, 2);
        return flip == 1 ? "Heads" : "Tails";
    }
}
