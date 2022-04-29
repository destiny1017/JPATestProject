package jpaShop;

import jpaShop.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPATestMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            User user = new User("user1");
            em.persist(user);

            Size shirtsSize = new Size("SHIRTS", "80", "105", "70", "0", "0", "");
            em.persist(shirtsSize);
            Clothes clothes1 = new Clothes("shirts1", 22000, "top", "SHIRTS", shirtsSize, "white");
            em.persist(clothes1);
            Book book1 = new Book("book1", 15000, "989955324832", "kdh", 233, Publisher.길벗);
            em.persist(book1);

            OrderItem orderItem1 = new OrderItem(clothes1, 1);
            em.persist(orderItem1);
            OrderItem orderItem2 = new OrderItem(book1, 2);
            em.persist(orderItem2);
            Order order = new Order(user);
            order.addOrderItems(orderItem1);
            order.addOrderItems(orderItem2);
            em.persist(order);

            em.flush();

            tx.commit();
        } catch(Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
