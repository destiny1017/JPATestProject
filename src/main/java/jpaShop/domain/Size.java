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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWaist() {
        return waist;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public String getHip() {
        return hip;
    }

    public void setHip(String hip) {
        this.hip = hip;
    }

    public String getInseam() {
        return inseam;
    }

    public void setInseam(String inseam) {
        this.inseam = inseam;
    }

    public String getSizeNumber() {
        return sizeNumber;
    }

    public void setSizeNumber(String sizeNumber) {
        this.sizeNumber = sizeNumber;
    }
}
