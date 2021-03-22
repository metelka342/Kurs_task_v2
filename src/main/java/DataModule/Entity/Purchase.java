package DataModule.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "purchase")
//@Table(appliesTo = "purchase")
public class Purchase {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "user_login")
    private String login;

    @Column(name = "product_id")
    private int productID;

    @Column(name = "seller_id")
    private int sellerID;

    @Column(name = "special_pacient")
    private boolean special;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "Purchase" + "\n" +
                "id=" + id + "\n" +
                "login='" + login + '\'' + "\n" +
                " productID=" + productID + "\n" +
                "sellerID=" + sellerID + "\n" +
                " special=" + special;
    }
}
