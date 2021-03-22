package LogicModule;

import DataModule.Entity.Purchase;
import DataModule.Entity.Users;
import com.sun.istack.NotNull;
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
    public void delete(@NotNull final Integer id) {
        try (final Session session = sessionFactory.openSession()) {
            final Purchase purchase = new Purchase();
            purchase.setId(id);
            session.beginTransaction();
            session.delete(purchase);
            session.getTransaction().commit();
        }
    }
}
