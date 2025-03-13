package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tab_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(scale = 13, precision = 2)
    private float balance;

    @Column(scale = 2, precision = 13)
    private float limit;

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }

    public String getAgency() { return agency; }

    public void setAgency(String agency) { this.agency = agency; }

    public float getBalance() { return balance; }

    public void setBalance(float balance) { this.balance = balance; }

    public float getLimit() { return limit; }

    public void setLimit(float limit) { this.limit = limit; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
