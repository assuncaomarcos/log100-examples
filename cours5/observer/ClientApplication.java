package observer;

public class ClientApplication {

    public static void main(String[] args) {
        // Création de l’agence
        NewsAgency agency = new NewsAgency();

        // Création des chaînes d'information
        NewsChannel sportsChannel = new NewsChannel(NewsType.SPORTS);
        NewsChannel politicsChannel = new NewsChannel(NewsType.POLITICS);
        NewsChannel scienceChannel = new NewsChannel(NewsType.SCIENCE);
        NewsChannel artsChannel = new NewsChannel(NewsType.ARTS);

        // Souscrit les chaînes
        agency.addObserver(sportsChannel);
        agency.addObserver(politicsChannel);
        agency.addObserver(scienceChannel);
        agency.addObserver(artsChannel);

        // Création de quelques articles (source: The Onion)

        News polNews = new News("Biden Vows That If Russia Invades Ukraine, " +
                "U.S. Will Invade One Country Of Equivalent Value", NewsType.POLITICS);
        agency.addNews(polNews);

        News sportsNews = new News("Greatest NFL Playoff Moments", NewsType.SPORTS);
        agency.addNews(sportsNews);

        News scienceNews = new News("NASA Gently Lowers Hot Dog On Fishing Line Into Black Hole",
                NewsType.SCIENCE);
        agency.addNews(scienceNews);
    }
}
