import java.util.*;

public class Dice {
    Random rand;
    int previousRoll = -1;

    public Dice(){
        this.rand = new Random();

    }
    //a dice has 6 so bound to 6
    public int roll(){
        int currentRoll = this.rand.nextInt(6) +1 ;
        //we want to keep track of the previous rolls
        this.previousRoll = currentRoll;

        return currentRoll;

    }
}
