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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
