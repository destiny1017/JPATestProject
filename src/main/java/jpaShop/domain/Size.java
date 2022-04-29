package jpaShop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Size {

    public Size(String kind, String chest, String length, String waist, String hip, String inseam, String sizeNumber) {
        this.kind = kind;
        this.chest = chest;
        this.length = length;
        this.waist = waist;
        this.hip = hip;
        this.inseam = inseam;
        this.sizeNumber = sizeNumber;
    }

    public Size() {
    }

    @Id
    private String kind;

    private String chest;
    private String length;
    private String waist;
    private String hip;
    private String inseam;
    private String sizeNumber;
}
