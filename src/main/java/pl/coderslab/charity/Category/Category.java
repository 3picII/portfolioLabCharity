package pl.coderslab.charity.Category;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Category.TABLE_NAME)
@AllArgsConstructor
@Data
public class Category {

    final static String TABLE_NAME="categories";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Category() {

    }
}
