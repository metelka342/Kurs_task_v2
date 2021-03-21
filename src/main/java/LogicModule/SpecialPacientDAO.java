package LogicModule;

import DataModule.Entity.Products;
import DataModule.Entity.SpecialPatient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SpecialPacientDAO implements Dao<SpecialPatient, Integer> {

    private final SessionFactory sessionFactory;

    public SpecialPacientDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(SpecialPatient specialPatient) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(specialPatient);
            session.getTransaction().commit();
        }
    }

    @Override
    public SpecialPatient read(Integer id) {
        try (final Session session = sessionFactory.openSession()) {
            SpecialPatient result = session.get(SpecialPatient.class, id);
            return result != null ? result : new SpecialPatient();
        }
    }

    @Override
    public void update(SpecialPatient specialPatient) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(specialPatient);
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
