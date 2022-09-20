package pl.coderslab.charity.Donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.coderslab.charity.Category.Category;
import pl.coderslab.charity.Institution.Institution;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = Donation.TABLE_NAME)
@AllArgsConstructor
@Data
public class Donation {

    final static String TABLE_NAME="donations";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
    @OneToMany(mappedBy = "donations", fetch = FetchType.LAZY)
    private List<Category> categories;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="institution_id", nullable = false)
    private Institution institution;
    private String street;
    private String city;
    private String zipCode;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;

    public Donation() {

    }
}