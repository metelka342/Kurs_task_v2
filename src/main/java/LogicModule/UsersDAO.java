package LogicModule;

import DataModule.Entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UsersDAO implements Dao<Users, Integer> {
    private final SessionFactory sessionFactory;

    public UsersDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Users user) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }
    }

    @Override
    public Users read(Integer id) {
        try (final Session session = sessionFactory.openSession()) {
            Users result = session.get(Users.class, id);
            return result != null ? result : new Users();
        }
    }

    @Override
    public void update(Users user) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(user);
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
