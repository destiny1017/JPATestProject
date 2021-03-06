package jpaShop.domain;

import javax.persistence.*;

@Entity
public class User extends BaseEntity {

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    @Id @GeneratedValue
    @Column(name = "USER_ID")
    private Long id;

    private String userName;

    @Embedded
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
