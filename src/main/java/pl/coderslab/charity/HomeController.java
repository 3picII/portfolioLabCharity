package pl.coderslab.charity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.donation.Donation;
import pl.coderslab.charity.donation.DonationService;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionService;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequiredArgsConstructor
public class HomeController {
private final InstitutionService institutionService;
private final DonationService donationService;

    @RequestMapping("/")
    public String homeAction(Model model){
//        Institution institution = new Institution();
//        institution.setName("Paruwex");
//        institution.setDescription("Firma z parówkami");
//        institutionService.saveInstitution(institution);
//        int i = 1;
//        Institution institution = institutionService.findById(1);
//        institution.setName("asdaw");
//        institution.setDescription("asdasd");
//        Donation donation = new Donation(4,institution);
//        donationService.saveDonation(donation);
//        Donation donation1 = new Donation(4,institution);
//        donationService.saveDonation(donation1);
        model.addAttribute("donationsNum",donationsTotal());
        model.addAttribute("bagsNum",bagsTotal());
        model.addAttribute("instList",institutionList());
        return "index";
    }
    public List<Institution> institutionList(){
        List<Institution> institutions = institutionService.findAll();
        return institutions;
    }

    public int bagsTotal(){
        int bags = 0;
        List<Donation> list = donationService.findAll();
        for(Donation d : list){
            bags += d.getQuantity();
        }
        return bags;
    }

    public int donationsTotal(){
        List listOfDonations = donationService.findAll();
        return listOfDonations.size();
    }
}
