public class Util {
    public static <K, V> boolean equals(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new OrderedPair<>(3, "pomme");
        Pair<Integer, String> p2 = new OrderedPair<>(4, "orange");
        boolean equals = Util.equals(p1, p2);
    }
}