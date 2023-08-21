public class JavaArrays {

    public static void main(String[] args) {
        float[] grades = {5f, 6.7f, 8f, 8.5f, 9f, 7.2f};
        String[] cars = {"Tesla", "Volvo", "BMW", "Ford", "Mazda"};

        System.out.println("La taille de grades est " + grades.length);
        System.out.println("La taille de cars est " + cars.length);

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("grades[%d] = %2.2f \n", i, grades[i]);
        }

        System.out.println("Les marques de voitures :");
        for (String elem : cars) {
            System.out.println(elem);
        }
    }
}
