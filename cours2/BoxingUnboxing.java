package cours2;

/* Programme Java pour démontrer le boxing et
unboxing par des classes enveloppes
Source: https://www.geeksforgeeks.org/wrapper-classes-java/ */
class BoxingUnboxing
{
    public static void main(String args[])
    {
        //  type primitif byte
        byte a = 1;

        // enveloppé par objet Byte
        Byte byteobj = Byte.valueOf(a);

        // type primitif  int
        int b = 10;

        // enveloppé par objet Integer
        Integer intobj = Integer.valueOf(b);

        // type primitif float
        float c = 18.6f;

        // enveloppé par objet Float
        Float floatobj = Float.valueOf(c);

        // type primitif double
        double d = 250.5;

        // enveloppé par objet Double
        Double doubleobj = Double.valueOf(d);

        // type primitif char data
        char e = 'a';

        // enveloppé par objet Character
        Character charobj = e;

        //  affiche les valeurs des objets
        System.out.println("Valeurs des objets enveloppe (en tant qu'objets)");
        System.out.println("Objet Byte byteobj:  " + byteobj);
        System.out.println("Objet Integer intobj:  " + intobj);
        System.out.println("Objet Float floatobj:  " + floatobj);
        System.out.println("Objet Double doubleobj:  " + doubleobj);
        System.out.println("Objet Character charobj:  " + charobj);

        // objets convertis en types de données primitifs
        // (récupération de types de données à partir d'objets)
        // objets sont "déballés" en types de données primitifs
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        //  affiche les valeurs des types primitifs
        System.out.println("Valeurs déballés (en tant que types primitifs)");
        System.out.println("Valeur byte, bv: " + bv);
        System.out.println("Valeur int, iv: " + iv);
        System.out.println("Valeur float, fv: " + fv);
        System.out.println("Valeur double, dv: " + dv);
        System.out.println("Valeur char, cv: " + cv);
    }
}
