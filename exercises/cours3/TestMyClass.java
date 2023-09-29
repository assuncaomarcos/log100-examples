package cours3;

class MyClass {
    public void print() {
        System.out.println("MyClass->print()");
    }
}

public class TestMyClass extends MyClass {
    public void print() {
        System.out.println("TestMyClass->print()");
    }

    public static void main(String[] args) {
        MyClass c = new MyClass();
        c.print();
    }
}
