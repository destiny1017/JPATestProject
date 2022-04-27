package jpaShop.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Item {
    private String isbn;
    private String author;
    private int page;
    private Publisher publisher;
}
