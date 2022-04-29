package jpaShop.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Clothes extends Item {

    public Clothes() {
    }

    public Clothes(String name, int price) {
        super(name, price);
    }

    public Clothes(String name, int price, String category, String kind, Size size, String color) {
        super(name, price);
        this.category = category;
        this.kind = kind;
        this.size = size;
        this.color = color;
    }

    private String category;
    private String kind;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SIZE_ID")
    private Size size;

    private String color;
}
