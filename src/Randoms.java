import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                random = new Random();
                int x = random.nextInt(max - min + 1) + min;
                return x;
            }
        };
    }
}