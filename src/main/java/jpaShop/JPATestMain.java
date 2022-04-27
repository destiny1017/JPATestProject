package jpaShop;

import jpaShop.domain.Order;
import jpaShop.domain.User;

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
            User user = new User();
            em.persist(user);
            user.setUserName("user1");
            Order order = new Order();
            order.setUser(user);
            em.persist(order);

            em.flush();

            Order order1 = em.find(Order.class, order.getId());
            System.out.println("order1 = " + order1);

            tx.commit();
        } catch(Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
