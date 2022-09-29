package pl.coderslab.charity.category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import pl.coderslab.charity.donation.Donation;

import javax.persistence.*;

@Entity
@Table(name = Category.TABLE_NAME)
@AllArgsConstructor
@Data
public class Category {

    final static String TABLE_NAME = "categories";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    public Category() {

    }

    @Override
    public String toString() {
        return  id + "," + name;
    }
}
