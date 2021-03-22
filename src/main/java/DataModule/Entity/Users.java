package DataModule.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(schema = "public", name = "users")
//@Table(appliesTo = "users")
public class Users {
    @Id
    @Column(name = "id")
    @PrimaryKeyJoinColumn(name = "id")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users" + "\n" +
                "id=" + id + "\n" +
                ", login='" + login + '\'' + "\n" +
                ", password='" + password + '\'' + "\n";
    }
}
