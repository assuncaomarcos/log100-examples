public class Casting {

    public static void main(String[] args) {
        int varInt = 100;
        long varLong = varInt;      // conversion automatique de int en long
        float varFloat = varLong;   // conversion automatique de long en float

        System.out.println("varInt = " + varInt + ", varLong = " +
                varLong + ", varFloat = " + varFloat);

        double varDouble = 200.5;
        long varLong2 = (long)varDouble;    // conversion explicite de double en long
        int varInt2 = (int)varLong2;        // conversion explicite de long en int
        byte varByte = (int)10;             // conversion explicite d'une valeur en byte

        System.out.println("varInt2 = " + varInt2 + ", varLong2 = " +
                varLong2 + ", varDouble = " + varDouble + ", varByte = " + varByte);
    }
}
