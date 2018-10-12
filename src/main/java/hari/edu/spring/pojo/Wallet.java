package hari.edu.spring.pojo;

import java.util.Set;

public class Wallet {

    int size;
    Set<String> cards;

    public Wallet(int size, Set<String> cards) {
        this.size = size;
        this.cards = cards;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Set<String> getCards() {
        return cards;
    }

    public void setCards(Set<String> cards) {
        this.cards = cards;
    }

}
