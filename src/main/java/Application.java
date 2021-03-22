import DataModule.Entity.Products;
import DataModule.Entity.Seller;
import LogicModule.ProductsDAO;
import LogicModule.SellerDAO;
import ViewModule.GUInew;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {


    public static void main(String[] args) {
        /*SessionFactory sessionFactory = null;
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();

            SellerDAO sellerDAO = new SellerDAO(sessionFactory);
            Seller testSeller = new Seller();

            Products products = new Products();
            ProductsDAO productsDAO = new ProductsDAO(sessionFactory);

            products.setName("[dpflkgd");
            products.setType("gfggfllfglfg");
            products.setVendor("qwe");
            products.setPrice(2);
            products.setCount(5);
            products.setDate("2002");

            productsDAO.create(products);
        *//*    testSeller.setName("Saveliy");
            testSeller.setAge(222227);

            sellerDAO.create(testSeller);*//*
            // System.out.println(sellerDAO.read(3));

            System.out.println(sellerDAO.getAllSellers());

        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }*/
        GUInew gui = new GUInew();
        gui.setVisible(true);
    }
}
