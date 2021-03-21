package LogicModule;

import DataModule.Entity.Seller;
import com.sun.istack.NotNull;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class SellerDAO implements Dao<Seller, Integer> {

    private final SessionFactory sessionFactory;

    public SellerDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Seller seller) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(seller);
            session.getTransaction().commit();
        }
    }

    @Override
    public Seller read(Integer id) {
        try (final Session session = sessionFactory.openSession()) {
            final Seller result = session.get(Seller.class, id);
            //return result != null ? result : new Seller();
            if (result != null) {
                Hibernate.initialize(result);
            }
            return result;
        }
    }

    @Override
    public void update(Seller seller) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(seller);
            session.getTransaction().commit();

        }
    }

    @Override
    public void delete(@NotNull final Integer id) {
        try (final Session session = sessionFactory.openSession()) {
            final Seller seller = new Seller();
            seller.setId(id);
            session.beginTransaction();
            session.delete(seller);
            session.getTransaction().commit();
        }
    }


    public List<Seller> getAllSellers(){
        try(final Session session = sessionFactory.openSession()){
            return session.getSession().createQuery("from Seller").list();
        }
    }
}
