import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        double probability;
        int i = 1;

        while (!StdIn.isEmpty()) {
            probability = 1.0 / i;
            i++;

            if (StdRandom.bernoulli(probability)) {
                champion = StdIn.readString();
            } else {
                StdIn.readString();
            }
        }
        StdOut.printf(champion);
    }
}
