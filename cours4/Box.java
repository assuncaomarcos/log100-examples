/**
 * Exemple de classe générique simple.
 * @param <T> le type de l'objet emballé
 */
public class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);

        Box<String> strBox = new Box<>();
        strBox.set("Une chaine de caracteres");

        Box<Double> dblBox = new Box<>();
        dblBox.set(2.3d);

        System.out.println(strBox.get() + ", " +  intBox.get() + ", " + dblBox.get());
    }
}