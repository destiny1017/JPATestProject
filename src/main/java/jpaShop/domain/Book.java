package jpaShop.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Item {

    public Book(String name, int price, String isbn, String author, int page, Publisher publisher) {
        super(name, price);
        this.isbn = isbn;
        this.author = author;
        this.page = page;
        this.publisher = publisher;
    }

    public Book(String name, int price) {
        super(name, price);
    }

    public Book() {
    }

    private String isbn;
    private String author;
    private int page;
    private Publisher publisher;
}
