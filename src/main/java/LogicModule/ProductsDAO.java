package LogicModule;

import DataModule.Entity.Products;
import DataModule.Entity.Seller;
import DataModule.Entity.Users;
import com.sun.istack.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ProductsDAO implements Dao<Products, Integer> {
    private final SessionFactory sessionFactory;

    public ProductsDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Products product) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        }
    }

    @Override
    public Products read(@NotNull Integer id) {
        try (final Session session = sessionFactory.openSession()) {
            Products result = session.get(Products.class, id);
            return result != null ? result : new Products();
        }
    }

    @Override
    public void update(@NotNull Products product) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(product);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(@NotNull final Integer id) {
        try (final Session session = sessionFactory.openSession()) {
            final Products products = new Products();
            products.setId(id);
            session.beginTransaction();
            session.delete(products);
            session.getTransaction().commit();
        }
    }


    public List<Products> getAllProducts() {
        try (final Session session = sessionFactory.openSession()) {
            return session.getSession().createQuery("from Products").list();
        }
    }

}
