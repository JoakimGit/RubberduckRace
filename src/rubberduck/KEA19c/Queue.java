package rubberduck.KEA19c;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private final List<Rubberduck> myQueue = new ArrayList<>();

    public Queue(int start, int end) {
        for (int i = start; i <= end; i++) {
            add(new Rubberduck(i));
        }
    }

    public Queue() {
    }

    public void add(Rubberduck duck) {
        myQueue.add(duck);
    }

    public Rubberduck remove() {
        return myQueue.remove(0);
    }

    public Rubberduck get(int index) {
        return myQueue.get(index);
    }

    public int size() {
        return myQueue.size();
    }

    @Override
    public String toString() {
        return myQueue.toString();
    }
}
