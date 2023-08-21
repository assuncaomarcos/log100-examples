public class SleepExample {

    public static void main(String[] args) {
        // Classe anonyme
        Runnable sleeping = new Runnable() {
            String[] messages = new String[] {
                    "Pellentesque quis arcu quis nisi rutrum mollis in non augue.",
                    "Nullam laoreet ipsum nec ultrices tincidunt.",
                    "Integer eu enim ac nunc finibus ornare id a mauris.",
                    "Sed sit amet tellus non odio tempor pretium.",
                    "Donec pharetra orci quis eros tincidunt malesuada."
            };
            @Override
            public void run() {
                for (String txt : messages) {
                    System.out.println(txt);
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrompu");
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread = new Thread(sleeping);
        thread.start();
    }
}