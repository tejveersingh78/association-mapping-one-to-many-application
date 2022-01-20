package com.sunglowsys.repository;

import com.sunglowsys.domain.Order;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Order saveOrder(Order order) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(order);
        session.getTransaction().commit();
        session.close();
        return order;

    }

    @Override
    public Order updateOrder(Order order, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order result = session.get(Order.class,id);
        result.setOrderName(order.getOrderName());
        session.update(result);
        session.getTransaction().commit();
        session.close();
        System.out.println("updated--");
        return null;
    }

    @Override
    public Order findById(Long id) {
        Session session = sessionFactory.openSession();
        Order order = session.get(Order.class,id);
        return order;
    }

    @Override
    public List<Order> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Order");
        List<Order> orderList = query.list();
        return orderList;
    }

    @Override
    public void deleteOrder(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = session.get(Order.class,id);
        session.delete(order);
        session.getTransaction().commit();
        session.close();
        System.out.println("deleted--");

    }
}
