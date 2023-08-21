import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        staff.add("Lottie Plourde");
        staff.add("Quentin Morel");
        staff.add("Apolline Charron");

        Iterator<String> iter = staff.iterator();
        String first = iter.next(); // visite le premier element
        String second = iter.next(); // visite le deuxieme element
        iter.remove(); // supprime le dernier element visite

        staff.remove(0); // supprime le premier element
    }
}
