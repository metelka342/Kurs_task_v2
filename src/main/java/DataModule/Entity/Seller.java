package DataModule.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;
//import org.hibernate.annotations.Table;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(schema = "public", name = "seller")
//@Table(appliesTo = "seller")
public class Seller {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Seller " + "\n" +
                "id=" + id + "\n" +
                " name='" + name + '\'' + "\n" +
                " age=" + age;
    }
}
