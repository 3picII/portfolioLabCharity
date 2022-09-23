package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class DonationService {
    private final DonationDao donationDao;

    public Donation findById(long id) {
        return donationDao.findById(id);
    }

    public List<Donation> findAll() {
        return donationDao.findAll();
    }

    public void saveDonation(Donation donation) {
        donationDao.saveDonation(donation);
    }

    public void deleteDonation(Donation donation) {
        donationDao.deleteDonation(donation);
    }

    public void updateDonation(Donation donation) {
        donationDao.updateDonation(donation);
    }
}
