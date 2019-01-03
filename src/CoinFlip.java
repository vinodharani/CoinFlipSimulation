public class CoinFlip {

    public static void main (String[] args) {
        double randomNumber = Math.random()*10;
        double middleNumber = 5;

        if (randomNumber > middleNumber) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}