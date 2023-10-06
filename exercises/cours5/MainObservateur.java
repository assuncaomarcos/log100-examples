package cours5;

import java.util.ArrayList;
import java.util.List;

interface Observateur {
    void mettreAJour(String message);
}

class Blog {
    private final List<Observateur> observateurs = new ArrayList<>();

    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void notifierObservateurs(String message) {
        for (Observateur observateur : observateurs) {
            observateur.mettreAJour(message);
        }
    }
}

class Abonne implements Observateur {
    private final String nom;

    public Abonne(String nom) {
        this.nom = nom;
    }

    @Override
    public void mettreAJour(String message) {
        System.out.println("Abonné " + nom + " a reçu une notification : " + message);
    }
}

class Admin implements Observateur {
    private final String nom;

    public Admin(String nom) {
        this.nom = nom;
    }

    @Override
    public void mettreAJour(String message) {
        System.out.println("Admin " + nom + " a reçu une notification : " + message);
    }
}

public class MainObservateur {

    public static void main(String[] args) {
        Blog blog = new Blog();

        Abonne abonne1 = new Abonne("Élise Martin");
        Admin admin1 = new Admin("Pierre Dubois");

        blog.ajouterObservateur(abonne1);
        blog.ajouterObservateur(admin1);

        // Pour envoyer une notification à tous les observateurs
        blog.notifierObservateurs("Nouvel article publié : " +
                "'Les Secrets de l'Énigme Éternelle'");
    }
}
