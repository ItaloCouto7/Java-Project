package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.FetchType;



import java.util.List;

@Entity(name = "tab_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Account getAccount() { return account; }

    public void setAccount(Account account) { this.account = account; }

    public Card getCard() { return card; }

    public void setCard(Card card) { this.card = card; }

    public List<Feature> getFeatures() { return features; }

    public void setFeatures(List<Feature> features) { this.features = features; }

    public List<News> getNews() { return news; }

    public void setNews(List<News> news) { this.news = news; }

    public Object getId() {
        return null;
    }
}
