package cours3;

class AnyPerson {
    public void speak() {
        System.out.println("C'est une personne qui parle");
    }
}

class GrandFather extends AnyPerson {
    public void speak() {
        System.out.println("C'est le grandpère qui parle");
    }
}

class Father extends GrandFather {
    public void speak() {
        System.out.println("C'est le père qui parle");
    }
}

class Son extends Father {
    public void speak() {
        System.out.println("C'est le fils qui parle");
    }
}

class Daughter extends Father {
    public void speak() {
        System.out.println("C'est le fille qui parle");
    }
}

public class Family {

    public static void main(String[] args) {
        AnyPerson ap = new Daughter();
        ap.speak();
        GrandFather gf = new GrandFather();
        gf.speak();
        Son s = new Son();
        ((AnyPerson)s).speak();
        GrandFather f = new Father();
        f.speak();
    }
}