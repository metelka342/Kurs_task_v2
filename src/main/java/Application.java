import DataModule.Entity.Seller;
import LogicModule.SellerDAO;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {


    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();

            SellerDAO sellerDAO = new SellerDAO(sessionFactory);
            Seller testSeller = new Seller();


            testSeller.setName("Saveliy");
            testSeller.setAge(222227);

            sellerDAO.create(testSeller);
            // System.out.println(sellerDAO.read(3));

            System.out.println(sellerDAO.getAllSellers());
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }

    }
}
