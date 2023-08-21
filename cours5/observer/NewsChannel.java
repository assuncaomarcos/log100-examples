package observer;

public class NewsChannel implements Observer<NewsAgency> {
    private NewsType channelType;

    public NewsChannel(NewsType type) {
        this.channelType = type;
    }

    private void showNews(News news) {
        System.out.println("\nBreaking news on " + news.getType().toString());
        System.out.println(news.getTitle());
    }

    @Override
    public void update(NewsAgency agency) {
        News news = agency.getLatestNews();

        if (news.getType() == this.channelType) {
            showNews(news);
        }
    }
}
