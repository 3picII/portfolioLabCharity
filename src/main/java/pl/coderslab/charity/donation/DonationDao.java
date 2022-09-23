package pl.coderslab.charity.donation;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class DonationDao {
    @PersistenceContext
    EntityManager entityManager;

    public Donation findById(long id) {
        return entityManager.find(Donation.class, id);
    }

    public List<Donation> findAll() {
        Query query = entityManager.createQuery("select d from Donation d");
        return query.getResultList();
    }

    public void saveDonation(Donation donation) {
        entityManager.persist(donation);
    }

    public void deleteDonation(Donation donation) {
        entityManager.remove(entityManager.contains(donation) ? donation : entityManager.merge(donation));
    }

    public void updateDonation(Donation donation) {
        entityManager.merge(donation);
    }
}
