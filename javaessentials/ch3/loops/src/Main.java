import java.lang.*;
import java.util.Random;
//use of different libraries

public class Main {
    public static void main (String[]args){
        double power = Math.pow(5,3);
        System.out.println(power);

        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);

        Random rand = new Random();
        int randomNumber= rand.nextInt();
        int randomNumberWithBound= rand.nextInt( 20);

        System.out.println(randomNumber);
        System.out.println(randomNumberWithBound);
    }
}
