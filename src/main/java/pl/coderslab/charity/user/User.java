package pl.coderslab.charity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.coderslab.charity.category.Category;

import javax.persistence.*;

@Data
@Entity
@Table(name = User.TABLE_NAME)
@AllArgsConstructor
public class User {

    final static String TABLE_NAME ="users";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;

    public User() {

    }
}
