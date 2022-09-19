package pl.coderslab.charity.Institution;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Institution.TABLE_NAME)
@AllArgsConstructor
@Data
public class Institution {

    final static String TABLE_NAME="institutions";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    public Institution() {

    }
}