package cours4;

import java.util.LinkedList;
import java.util.Queue;

class Client {
    private String name;
    private int number;

    public Client(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}

class WaitingQueue {
    private Queue<Client> queue = new LinkedList<>();

    public void addClient(Client client) {
        queue.add(client);
    }

    public String checkout() {
        if (queue.isEmpty()) {
            return "Aucun client en attente.";
        }
        Client client = queue.poll();
        return "Le client " + client.getNumber() +
                ", " + client.getName() + " passe en caisse.";
    }
}

public class SuperMarket {
    public static void main(String[] args) {
        WaitingQueue waitingQueue = new WaitingQueue();

        // Ajout de clients à la file
        waitingQueue.addClient(new Client("Emeline Dubois", 1));
        waitingQueue.addClient(new Client("Hugo Martin", 2));
        waitingQueue.addClient(new Client("Manon Dupont", 3));
        waitingQueue.addClient(new Client("Théo Lefebvre", 4));

        // Simulation du passage en caisse
        System.out.println(waitingQueue.checkout());
        System.out.println(waitingQueue.checkout());
        System.out.println(waitingQueue.checkout());
        System.out.println(waitingQueue.checkout());
        System.out.println(waitingQueue.checkout());
    }
}
