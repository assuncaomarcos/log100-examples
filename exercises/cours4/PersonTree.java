package cours4;

class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public void add(T value) {
        this.root = insertRec(this.root, value);
    }

    private TreeNode<T> insertRec(TreeNode<T> root, T value) {
        if (root == null) {
            return new TreeNode<>(value);
        }

        if (value.compareTo(root.value) < 0) {
            root.left = insertRec(root.left, value);
        } else if (value.compareTo(root.value) > 0) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public boolean search(T value) {
        return searchRec(root, value);
    }

    private boolean searchRec(TreeNode<T> root, T value) {
        if (root == null) {
            return false;
        }

        if (value.compareTo(root.value) == 0) {
            return true;
        } else if (value.compareTo(root.value) < 0) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(this.root);
    }

    private void inOrderTraversalRec(TreeNode<T> root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.value + "\n");
            inOrderTraversalRec(root.right);
        }
    }

    static class TreeNode<T extends Comparable<T>> {
        T value;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", email=" + email + "]";
    }
}

public class PersonTree {
    public static void main(String[] args) {
        BinaryTree<Person> people = new BinaryTree<>();

        // Ajout de personnes à l'ABR par leur âge
        people.add(new Person("Émilie Dupont", 25, "emilie.dupont@email.ca"));
        people.add(new Person("Mathieu Lambert", 30, "mathieu.lambert@email.ca"));
        people.add(new Person("Olivier Dubois", 35, "olivier.dubois@email.ca"));
        people.add(new Person("Léa Perrin", 28, "lea.perrin@email.ca"));
        people.add(new Person("Sophie Martin", 22, "sophie.martin@email.ca"));

        // Recherche d'une personne par âge
        int ageSearch = 30;
        if (people.search(new Person("", ageSearch, ""))) {
            System.out.println("Personne de " + ageSearch + " ans trouvée.");
        } else {
            System.out.println("Personne de " + ageSearch + " ans non trouvée.");
        }

        // Traversée infixée pour afficher les personnes par ordre d'âge
        System.out.println("Personnes par ordre d'âge :");
        people.inOrderTraversal();
    }
}
