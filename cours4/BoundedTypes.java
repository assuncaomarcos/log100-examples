import java.time.LocalDate;

public class BoundedTypes {

    public static <T extends Comparable<T>> T max(T[] tab) {
        if (tab == null || tab.length == 0) return null;
        T max = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (max.compareTo(tab[i]) < 0) {
                max = tab[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1987, 12, 9),
                LocalDate.of(1979, 12, 10),
                LocalDate.of(1980, 12, 3),
                LocalDate.of(2000, 6, 22),
        };
        LocalDate date = (LocalDate) BoundedTypes.max(birthdays);
        System.out.println("Date : " + date);
    }
}
