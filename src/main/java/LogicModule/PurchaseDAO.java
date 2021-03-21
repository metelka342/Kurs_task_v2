package LogicModule;

import DataModule.Entity.Purchase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PurchaseDAO implements Dao<Purchase, Integer> {


    private final SessionFactory sessionFactory;

    public PurchaseDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Purchase purchase) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(purchase);
            session.getTransaction().commit();
        }
    }

    @Override
    public Purchase read(Integer integer) {
        try (final Session session = sessionFactory.openSession()) {
            Purchase result = session.get(Purchase.class, integer);
            return result != null ? result : new Purchase();
        }
    }

    @Override
    public void update(Purchase purchase) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(purchase);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Integer id) {
        try (final Session session = sessionFactory.openSession()) {
        session.beginTransaction();
        session.delete(id);
        session.getTransaction().commit();
        }
    }
}
