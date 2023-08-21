public class UseMath {
    // Exemple qui utilise quelques methodes de la classe Math
    public static void main(String[] args) {
        double value = 9d; double another = 3d;
        System.out.println("La racine carrée de " + value + " est " + Math.sqrt(value));
        System.out.println("La valuer minimale est " + Math.min(value, another));
        System.out.println("La valuer maximale est " + Math.max(value, another));
        System.out.println( value + " à la puissance " + another
                + " vaut " + Math.pow(value, another));
    }
}
