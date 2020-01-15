import java.util.*;

public class Coin {

    public final static int HEADS =0;
    public final static int TAILS =1;

    private int faceUp;
    //CONSTRUCTOR
    public Coin(){
        flip();

    }
    //METHOD
    public void flip(){
        Random rand = new Random();
        faceUp = rand.nextInt(2);
    }
    //METHOD

    public String getFaceUp() {
        if ( faceUp == HEADS){
            return "HEADS";
        }
        else if (faceUp == TAILS){
            return "TAILS";
        }
        else{
            return "INVALID";
        }

    }

}
