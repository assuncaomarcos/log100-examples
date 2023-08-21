package observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NewsAgency implements Observable {
    private Set<Observer> observers = new HashSet<>();
    private List<News> news = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        if (!this.observers.contains(o)) {
            this.observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (this.observers.contains(o)) {
            this.observers.remove(o);
        }
    }

    public News getLatestNews() {
        if (news.size() > 0) {
            return news.get(news.size() - 1);
        }
        return null;
    }

    private void notifyChannels() {
        for (Observer channel : this.observers) {
            channel.update(this);
        }
    }

    public void addNews(News news) {
        this.news.add(news);
        notifyChannels();
    }
}
