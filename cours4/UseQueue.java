import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class UseQueue {

    public static void main(String[] args) {
        Queue<String> q1 = new ArrayBlockingQueue<>(5);
        q1.add("un"); q1.add("deux"); q1.add("trois");
        System.out.println("Premier element de q1 : " + q1.remove());

        Queue<String> q2 = new LinkedList<>();
        q2.add("quatre"); q2.add("cinq"); q2.add("six");
        System.out.println("Premier element de q2 : " + q2.remove());
    }
}
