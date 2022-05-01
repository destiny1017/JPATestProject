package jpaShop.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
