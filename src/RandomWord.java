import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

/*
Write a program RandomWord.java that reads a sequence of words from standard input
and prints one of those words uniformly at random. Do not store the words in an array
or list. Instead, use Knuth’s method: when reading the ith word, select it with
probability 1/i to be the champion, replacing the previous champion. After reading
all the words, print the surviving champion.
 */
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
