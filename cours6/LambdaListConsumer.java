import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaListConsumer {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Toyota"); list.add("Honda");
        list.add("Tesla"); list.add("Volvo");

        Consumer<String> consumer = e -> System.out.println(e);
        list.forEach(consumer);
    }
}