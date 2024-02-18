import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    int i;

    public Randoms(int min, int max) {
        i = random.nextInt(max - min + 1) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int next;
            int before = i;

            @Override
            public boolean hasNext() {
                if (next != 100) {
                    if (next == before) {
                        return false;
                    }
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                next = i;
                return next;

            }
        };
    }
}