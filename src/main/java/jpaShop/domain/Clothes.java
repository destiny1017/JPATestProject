package jpaShop.domain;

import javax.persistence.Entity;

@Entity
public class Clothes extends Item {
    private String category;
    private Size size;
    private String color;
}
