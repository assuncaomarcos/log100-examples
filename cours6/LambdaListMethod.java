import java.util.ArrayList;

interface StringFunction {
    String run(String str);
}

public class LambdaListMethod {

    public static void print(String str, StringFunction function) {
        System.out.println(function.run(str));
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Toyota"); list.add("Honda");
        list.add("Tesla"); list.add("Volvo");

        StringFunction formatter = s -> "Voiture: " + s;
        list.forEach(s -> print(s, formatter));
    }
}