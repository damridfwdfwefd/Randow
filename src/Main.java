import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Random random1 = new Random(100l);
        int onlyRandom = random.nextInt();
        int seededRandom = random1.nextInt();
        int rangeFrom0to5 = random.nextInt(5);



        System.out.println(onlyRandom);
        System.out.println(seededRandom);
        System.out.println(rangeFrom0to5);
    }
}