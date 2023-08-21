public class UseStringBuilder {
    public static void main(String args[]) {
        StringBuilder builder = new StringBuilder("LOG100 Programmation");
        System.out.println("Longueur : " + builder.length());
        System.out.println("Capacité : " + builder.capacity());
        builder.append(" Java Reséautique");
        System.out.println("Après append() : " + builder);

        builder.insert(25, " -");
        System.out.println("Après insert() : " + builder);

        builder.reverse();
        System.out.println("Après reverse() : " + builder);

        builder.deleteCharAt(12);
        System.out.println("Après deleteCharAt(12) : " + builder);

        builder.delete(0, 13);
        System.out.println("Après delete(0, 13) : " + builder);

        builder.reverse();
        System.out.println("Après reverse() : " + builder);
    }
}
