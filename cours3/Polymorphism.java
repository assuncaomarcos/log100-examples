class Animal {
    public void makeSound() {
        System.out.println("L'animal fait un bruit");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Le chien aboie");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Le chat fait miaou");
    }
}

public class Polymorphism {
    public static final void main(String[] args) {
        Animal animal = new Animal();  // crée un objet Animal
        Animal dog = new Dog();        // crée un objet Dog
        Animal cat = new Cat();        // crée un objet Dog

        animal.makeSound();    // affiche: L'animal fait un bruit
        dog.makeSound();       // affiche: Le chien aboie
        cat.makeSound();       // Le chat fait miaou
    }
}
