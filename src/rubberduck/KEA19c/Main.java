package rubberduck.KEA19c;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Queue> myQueues = new ArrayList<>();
        int start = 1;
        int end = 10;
        for (int i = 0; i < 10; i++) {
            myQueues.add(new Queue(start, end));
            start += 10;
            end += 10;
        }
        int count = 9;
        while (count > 0) {
            List<Queue> nextQueue = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                nextQueue.add(new Queue());
            }
            int filled = 0;
            // Start taking ducks from current iteration to the new one until all queues have been filled
            while (filled < (count*count)) {
                Random r = new Random();
                Rubberduck chosenDuck;
                // Select a random queue from the current/old queue
                int oldQueue = r.nextInt(count+1);
                Queue chosenOldQueue = myQueues.get(oldQueue);
                // If it's not empty, remove from the front of the queue, otherwise select a new random queue
                if (chosenOldQueue.size() > 0) {
                    chosenDuck = chosenOldQueue.remove();
                } else continue;

                boolean go = true;
                while (go) {
                    // Select a random queue from the next iteration of queues
                    int newQueue = r.nextInt(count);
                    Queue selectedQueue = nextQueue.get(newQueue);
                    // If selected queue isn't full yet, add it to the back of the queue, otherwise loop restarts
                    if (selectedQueue.size() < count) {
                        selectedQueue.add(chosenDuck);
                        filled++;
                        go = false;
                    }
                }
            }
            // Make amount and size of the queues 1 less
            count--;
            // Set old queue to be the new one in preperation for next iteration
            myQueues = nextQueue;
            int totalducks = 0;
            for (Queue q : myQueues) {
                totalducks += q.size();
            }
            System.out.println("Amount and size of queues is: " + myQueues.size() + " and the total amount of ducks is: " + totalducks);
            for (Queue q : myQueues) {
                System.out.println(q);
            }
            System.out.println();
        }
        Rubberduck winner = myQueues.get(0).get(0);
        System.out.println("The winning duck is duck number " + winner.getNumber());
    }
}
