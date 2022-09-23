package pl.coderslab.charity.category;

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

    @ManyToOne
    private Donation donation;

    public Category() {

    }
}
