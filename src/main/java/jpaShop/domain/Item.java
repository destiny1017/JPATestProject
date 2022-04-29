package jpaShop.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Item() {
    }

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;

}
