package ViewModule;


import DataModule.Entity.*;
import LogicModule.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.awt.event.ActionListener;


public class GUInew extends JFrame {

    private JButton button1 = new JButton("read product");
    private JButton button3 = new JButton("update product");
    private JButton button4 = new JButton("delete product");
    private JButton button5 = new JButton("add product");

    private JButton button2 = new JButton("read user");
    private JButton button6 = new JButton("update user");
    private JButton button7 = new JButton("delete user");
    private JButton button8 = new JButton("add user");

    private JButton button12 = new JButton("read seller");
    private JButton button11 = new JButton("update seller");
    private JButton button9 = new JButton("delete seller");
    private JButton button10 = new JButton("add seller");


    private JButton button13 = new JButton("read purchase");
    private JButton button14 = new JButton("update purchase");
    private JButton button15 = new JButton("delete purchase");
    private JButton button16 = new JButton("add purchase");

    private JButton button17 = new JButton("read patient");
    private JButton button18 = new JButton("update patient");
    private JButton button19 = new JButton("delete patient");
    private JButton button20 = new JButton("add patient");


    private JTextField textField1 = new JTextField("", 15);
    private JTextField textField2 = new JTextField("", 15);
    private JTextField textField3 = new JTextField("", 15);
    private JTextField textField4 = new JTextField("", 15);
    private JTextField textField5 = new JTextField("", 15);
    private JTextField textField6 = new JTextField("", 15);
    private JTextField textField7 = new JTextField("", 15);
    private JTextField textField8 = new JTextField("", 15);
    private JTextField textField9 = new JTextField("", 15);
    private JTextField textField10 = new JTextField("", 15);
    private JTextField textField11 = new JTextField("", 15);
    private JTextField textField12 = new JTextField("", 15);
    private JTextField textField13 = new JTextField("", 15);
    private JTextField textField14 = new JTextField("", 15);
    private JTextField textField15 = new JTextField("", 15);
    private JTextField textField16 = new JTextField("", 15);
    private JTextField textField17 = new JTextField("", 15);
    private JTextField textField18 = new JTextField("", 15);


    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();
    private JLabel label5 = new JLabel();
    private JLabel label6 = new JLabel();
    private JLabel label7 = new JLabel();
    private JLabel label8 = new JLabel();
    private JLabel label9 = new JLabel();
    private JLabel label10 = new JLabel();
    private JLabel label11 = new JLabel();
    private JLabel label12 = new JLabel();
    private JLabel label13 = new JLabel();
    private JLabel label14 = new JLabel();
    private JLabel label15 = new JLabel();

    private JTextArea textArea1 = new JTextArea();
    private JScrollPane scroll = new JScrollPane(textArea1);

    public GUInew() {
        super("proga");
        this.setBounds(100, 100, 1200, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField1.setSize(90, 20);
        textField1.setLocation(100, 45);

        textField2.setSize(90, 20);
        textField2.setLocation(100, 70);

        textField3.setSize(90, 20);
        textField3.setLocation(100, 95);

        textField4.setSize(90, 20);
        textField4.setLocation(100, 120);

        textField5.setSize(90, 20);
        textField5.setLocation(100, 145);

        textField6.setSize(90, 20);
        textField6.setLocation(105, 170);

        textField7.setSize(70, 20);
        textField7.setLocation(260, 45);

        textField8.setSize(70, 20);
        textField8.setLocation(260, 70);

        textField9.setSize(70, 20);
        textField9.setLocation(260, 95);

        textField10.setSize(70, 20);
        textField10.setLocation(260, 120);

        textField11.setSize(70, 20);
        textField11.setLocation(260, 145);

        textField12.setSize(70, 20);
        textField12.setLocation(260, 170);

        textField13.setSize(60, 20);
        textField13.setLocation(390, 170);

        textField14.setSize(70, 20);
        textField14.setLocation(260, 220);

        textField15.setSize(70, 20);
        textField15.setLocation(120, 220);


        label1.setSize(90, 20);
        label1.setText("productID");
        label1.setLocation(5, 170);

        label2.setSize(90, 20);
        label2.setText("name");
        label2.setLocation(5, 40);

        label3.setSize(90, 20);
        label3.setText("type");
        label3.setLocation(5, 65);

        label4.setSize(120, 20);
        label4.setText("date");
        label4.setLocation(5, 90);

        label5.setSize(90, 20);
        label5.setText("vendor");
        label5.setLocation(5, 115);

        label6.setSize(90, 20);
        label6.setText("price");
        label6.setLocation(5, 140);

        label7.setSize(90, 20);
        label7.setText("count");
        label7.setLocation(195, 45);

        label8.setSize(90, 20);
        label8.setText("age");
        label8.setLocation(195, 70);

        label9.setSize(90, 20);
        label9.setText("medName");
        label9.setLocation(195, 95);

        label10.setSize(120, 20);
        label10.setText("login");
        label10.setLocation(195, 120);

        label11.setSize(90, 20);
        label11.setText("password");
        label11.setLocation(195, 145);

        label12.setSize(90, 20);
        label12.setText("sellerID");
        label12.setLocation(195, 170);

        label13.setSize(50, 20);
        label13.setText("userID");
        label13.setLocation(340, 170);

        label14.setSize(50, 20);
        label14.setText("patientID");
        label14.setLocation(195, 220);

        label15.setSize(80, 20);
        label15.setText("purchaseID");
        label15.setLocation(50, 220);

        //read product
        button1.setSize(130, 20);
        button1.setLocation(500, 100);

        //update product
        button3.setSize(130, 20);
        button3.setLocation(500, 140);

        //delete product
        button4.setSize(130, 20);
        button4.setLocation(500, 180);

        //add product
        button5.setSize(130, 20);
        button5.setLocation(500, 60);

        //update user
        button6.setSize(130, 20);
        button6.setLocation(750, 140);

        //delete user
        button7.setSize(130, 20);
        button7.setLocation(750, 180);

        //add user
        button8.setSize(130, 20);
        button8.setLocation(750, 60);

        //read user
        button2.setSize(130, 20);
        button2.setLocation(750, 100);


        //add seller
        button10.setSize(130, 20);
        button10.setLocation(1000, 60);

        //update seller
        button11.setSize(130, 20);
        button11.setLocation(1000, 140);

        //read seller
        button12.setSize(130, 20);
        button12.setLocation(1000, 100);

        //delete seller
        button9.setSize(130, 20);
        button9.setLocation(1000, 180);

        //add purchase
        button16.setSize(130, 20);
        button16.setLocation(625, 240);

        //read purchase
        button13.setSize(130, 20);
        button13.setLocation(625, 280);

        //update purchase
        button14.setSize(130, 20);
        button14.setLocation(625, 320);

        //delete purchase
        button15.setSize(130, 20);
        button15.setLocation(625, 360);


        //add patient
        button20.setSize(130, 20);
        button20.setLocation(825, 240);

        //read patient
        button17.setSize(130, 20);
        button17.setLocation(825, 280);

        //update patient
        button18.setSize(130, 20);
        button18.setLocation(825, 320);

        //delete patient
        button19.setSize(130, 20);
        button19.setLocation(825, 360);


        textArea1.setSize(350, 270);
        textArea1.setLocation(420, 45);

        scroll.setSize(300, 270);
        scroll.setLocation(50, 300);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        //products
        button4.addActionListener(actionListener4());
        button1.addActionListener(actionListener2());
        button3.addActionListener(actionListener3());
        button5.addActionListener(actionListener1());


        //users
        button6.addActionListener(actionListener5());
        button7.addActionListener(actionListener6());
        button8.addActionListener(actionListener7());
        button2.addActionListener(actionListener8());


        button10.addActionListener(actionListener9());
        button11.addActionListener(actionListener10());
        button12.addActionListener(actionListener11());
        button9.addActionListener(actionListener12());

        button13.addActionListener(actionListener13());
        button14.addActionListener(actionListener14());
        button15.addActionListener(actionListener15());
        button16.addActionListener(actionListener16());

        button17.addActionListener(actionListener17());
        button18.addActionListener(actionListener18());
        button19.addActionListener(actionListener19());
        button20.addActionListener(actionListener20());


        setLayout(null);

        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);
        add(textField5);
        add(textField6);
        add(textField7);
        add(textField8);
        add(textField9);
        add(textField10);
        add(textField11);
        add(textField12);
        add(textField13);
        add(textField14);
        add(textField15);


        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label9);
        add(label10);
        add(label11);
        add(label12);
        add(label13);
        add(label14);
        add(label15);


        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        add(button12);
        add(button13);
        add(button14);
        add(button15);
        add(button16);
        add(button17);
        add(button18);
        add(button19);
        add(button20);

        /*add(textArea1);*/
        add(scroll);

    }


    private ActionListener actionListener1() {
        return e -> {
            createProduct();
        };
    }

    private ActionListener actionListener2() {
        return e -> {
            readProduct();
        };
    }

    private ActionListener actionListener3() {
        return e -> {
            updateProduct();
        };
    }

    private ActionListener actionListener4() {
        return e -> {
            deleteProduct();
        };
    }


    private ActionListener actionListener5() {
        return e -> {
            updateUser();
        };
    }

    private ActionListener actionListener6() {
        return e -> {
            deleteUser();
        };
    }

    private ActionListener actionListener7() {
        return e -> {
            createUser();
        };
    }

    private ActionListener actionListener8() {
        return e -> {
            readUser();
        };
    }


    private ActionListener actionListener9() {
        return e -> {
            createSeller();
        };
    }

    private ActionListener actionListener10() {
        return e -> {
          updateSeller();
        };
    }

    private ActionListener actionListener11() {
        return e -> {
            readSeller();
        };
    }

    private ActionListener actionListener12() {
        return e -> {
            deleteSeller();
        };
    }


    private ActionListener actionListener13() {
        return e -> {
            readPurchase();
        };
    }

    private ActionListener actionListener14() {
        return e -> {
            updatePurchase();
        };
    }

    private ActionListener actionListener15() {
        return e -> {
            deletePurchase();
        };
    }

    private ActionListener actionListener16() {
        return e -> {
            createPurchase();
        };
    }


    private ActionListener actionListener17() {
        return e -> {
            readSpecialPatient();
        };
    }

    private ActionListener actionListener18() {
        return e -> {
            updateSpecialPatient();
        };
    }

    private ActionListener actionListener19() {
        return e -> {
            deleteSpecialPatient();
        };
    }

    private ActionListener actionListener20() {
        return e -> {
        createSpecialPatient();
        };
    }


    public void createProduct() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            ProductsDAO productsDAO = new ProductsDAO(sessionFactory);


            try {
                final Products product = new Products();
                product.setName(textField1.getText());
                product.setType(textField2.getText());
                product.setDate(textField3.getText());
                product.setVendor(textField4.getText());
                product.setPrice(Float.parseFloat(textField5.getText()));
                product.setCount(Integer.parseInt(textField7.getText()));
                productsDAO.create(product);
                textArea1.setText("product created");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void readProduct() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            ProductsDAO productsDAO = new ProductsDAO(sessionFactory);


            try {
                textArea1.setText(productsDAO.read(Integer.parseInt(textField6.getText())).toString());

            } catch (Exception e) {
                textArea1.setText("no such product, you've just created him");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void updateProduct() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            ProductsDAO productsDAO = new ProductsDAO(sessionFactory);


            try {
                final Products product = new Products();
                product.setName(textField1.getText());
                product.setType(textField2.getText());
                product.setDate(textField3.getText());
                product.setVendor(textField4.getText());
                product.setPrice(Float.parseFloat(textField5.getText()));
                product.setCount(Integer.parseInt(textField7.getText()));
                product.setId(Integer.parseInt(textField6.getText()));
                productsDAO.update(product);
                textArea1.setText("product updated");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void deleteProduct() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            ProductsDAO productsDAO = new ProductsDAO(sessionFactory);


            try {
                productsDAO.delete(Integer.parseInt(textField6.getText()));
                textArea1.setText("deleted");
            } catch (Exception e) {
                textArea1.setText("no such product");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void createSeller() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            SellerDAO sellerDAO = new SellerDAO(sessionFactory);

            try {
                final Seller seller = new Seller();
                seller.setName(textField1.getText());
                seller.setAge(Integer.parseInt(textField8.getText()));
                sellerDAO.create(seller);
                textArea1.setText("seller created");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void readSeller() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            SellerDAO sellerDAO = new SellerDAO(sessionFactory);


            try {
                textArea1.setText(sellerDAO.read(Integer.parseInt(textField12.getText())).toString());

            } catch (Exception e) {
                textArea1.setText("no such seller, you've just created him");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void updateSeller() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            SellerDAO sellerDAO = new SellerDAO(sessionFactory);


            try {
                final Seller seller = new Seller();
                seller.setName(textField1.getText());
                seller.setAge(Integer.parseInt(textField8.getText()));
                seller.setId(Integer.parseInt(textField12.getText()));
                sellerDAO.update(seller);
                textArea1.setText("seller updated");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void deleteSeller() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            SellerDAO sellerDAO = new SellerDAO(sessionFactory);


            try {
                sellerDAO.delete(Integer.parseInt(textField12.getText()));
                textArea1.setText("deleted");
            } catch (Exception e) {
                textArea1.setText("no such seller");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void createPurchase() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            PurchaseDAO purchaseDAO =new PurchaseDAO(sessionFactory);


            try {
                final Purchase purchase = new Purchase();
                purchase.setLogin(textField1.getText());
                purchase.setProductID(Integer.parseInt(textField10.getText()));
                purchase.setSellerID(Integer.parseInt(textField12.getText()));
                purchase.setSpecial(!textField4.getText().isEmpty());

                purchaseDAO.create(purchase);
                textArea1.setText("purchase created");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void readPurchase() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            PurchaseDAO purchaseDAO =new PurchaseDAO(sessionFactory);


            try {
                textArea1.setText(purchaseDAO.read(Integer.parseInt(textField15.getText())).toString());

            } catch (Exception e) {
                textArea1.setText("no such purchase, you've just created him");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void updatePurchase() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            PurchaseDAO purchaseDAO =new PurchaseDAO(sessionFactory);


            try {
                final Purchase purchase = new Purchase();
                purchase.setLogin(textField1.getText());
                purchase.setProductID(Integer.parseInt(textField10.getText()));
                purchase.setSellerID(Integer.parseInt(textField12.getText()));
                purchase.setSpecial(!textField4.getText().isEmpty());
                purchase.setId(Integer.parseInt(textField15.getText()));
                purchaseDAO.update(purchase);
                textArea1.setText("purchase updated");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void deletePurchase() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            PurchaseDAO purchaseDAO =new PurchaseDAO(sessionFactory);


            try {
                purchaseDAO.delete(Integer.parseInt(textField15.getText()));
                textArea1.setText("deleted");
            } catch (Exception e) {
                textArea1.setText("no such purchase");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void createSpecialPatient() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            SpecialPacientDAO specialPacientDAO = new SpecialPacientDAO(sessionFactory);


            try {
                final SpecialPatient specialPatient = new SpecialPatient();
                specialPatient.setName(textField1.getText());
                specialPatient.setDrug(textField9.getText());

                specialPacientDAO.create(specialPatient);
                textArea1.setText("specialPatient created");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void readSpecialPatient() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            SpecialPacientDAO specialPacientDAO = new SpecialPacientDAO(sessionFactory);


            try {
                textArea1.setText(specialPacientDAO.read(Integer.parseInt(textField14.getText())).toString());

            } catch (Exception e) {
                textArea1.setText("no such specialPatient, you've just created him");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void updateSpecialPatient() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            SpecialPacientDAO specialPacientDAO = new SpecialPacientDAO(sessionFactory);


            try {
                final SpecialPatient specialPatient = new SpecialPatient();
                specialPatient.setName(textField1.getText());
                specialPatient.setDrug(textField9.getText());
                specialPatient.setId(Integer.parseInt(textField14.getText()));

                specialPacientDAO.create(specialPatient);
                textArea1.setText("specialPatient updated");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void deleteSpecialPatient() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            SpecialPacientDAO specialPacientDAO = new SpecialPacientDAO(sessionFactory);


            try {
                specialPacientDAO.delete(Integer.parseInt(textField14.getText()));
                textArea1.setText("deleted");
            } catch (Exception e) {
                textArea1.setText("no such specialPacient");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void createUser() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            UsersDAO usersDAO = new UsersDAO(sessionFactory);


            try {
                final Users user = new Users();
                user.setLogin(textField10.getText());
                user.setPassword(textField11.getText());

                usersDAO.create(user);
                textArea1.setText("user created");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void readUser() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            UsersDAO usersDAO = new UsersDAO(sessionFactory);


            try {
                textArea1.setText(usersDAO.read(Integer.parseInt(textField13.getText())).toString());

            } catch (Exception e) {
                textArea1.setText("no such user");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void updateUser() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            UsersDAO usersDAO = new UsersDAO(sessionFactory);


            try {
                final Users user = new Users();
                user.setLogin(textField10.getText());
                user.setPassword(textField11.getText());


                user.setId(Integer.parseInt(textField13.getText()));
                usersDAO.update(user);
                textArea1.setText("user updated");
            } catch (Exception e) {
                textArea1.setText("error");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }

    public void deleteUser() {
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            UsersDAO usersDAO = new UsersDAO(sessionFactory);


            try {
                usersDAO.delete(Integer.parseInt(textField13.getText()));
                textArea1.setText("deleted");
            } catch (Exception e) {
                textArea1.setText("no such user");
            }
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }


}
