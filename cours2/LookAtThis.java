public class LookAtThis {
    int myVar = 5;

    LookAtThis(int myVar) {
        myVar = myVar + 5;
        System.out.println(myVar);
    }

    public static void main(String[] args) {
        LookAtThis obj = new LookAtThis(10);
        System.out.println(obj.myVar);
    }
}
