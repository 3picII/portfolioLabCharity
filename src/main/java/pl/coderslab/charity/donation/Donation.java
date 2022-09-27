package pl.coderslab.charity.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.institution.Institution;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = Donation.TABLE_NAME)
@AllArgsConstructor
@Data
public class Donation {

    final static String TABLE_NAME = "donations";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
//    @OneToMany(mappedBy = "donation", fetch = FetchType.LAZY)
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "donation_category",
            joinColumns = {@JoinColumn(name = "donation_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    private List<Category> categories;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "institution_id", nullable = false)
    private Institution institution;
    private String street;
    private String city;
    private String zipCode;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;

    public Donation() {

    }

    public Donation(int quantity, Institution institution) {
        this.quantity = quantity;
        this.institution = institution;
    }
}