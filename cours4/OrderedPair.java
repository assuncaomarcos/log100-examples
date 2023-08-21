public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Dix", 10);
        Pair<String, String>  p2 = new OrderedPair<String, String>("salut", "tout le monde");

        Pair[] tab = new OrderedPair[2];
        tab[0] = p1;
        tab[1] = p2;
    }
}
