package pl.coderslab.charity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.category.CategoryService;
import pl.coderslab.charity.donation.Donation;
import pl.coderslab.charity.donation.DonationService;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionService;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class DonationController {
    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;
    Donation donation = new Donation();

    @GetMapping("/form1")
    public String form1(Model model){
//        Category category1 = new Category();
//        category1.setName("alkohol");
//        categoryService.saveCategory(category1);
        List<Category> categoryList = new ArrayList<>();
        model.addAttribute("catList", categoryList);
        model.addAttribute("donation",donation);
        model.addAttribute("category",new Category());
        model.addAttribute("categories1",categoryService.findAll());
        return "form1";
    }
    @PostMapping("/form1")
    public String form1(@ModelAttribute("donation") @Valid Donation donation1){
        System.out.println(donation1);
        donation.setCategories(donation1.getCategories());
        return "redirect:/form2";
    }

    @GetMapping("/form2")
    public String form2(){
        return "form2";
    }
    @PostMapping("/form2")
    public String form2(@RequestParam(name="quantity") int quantity){
        donation.setQuantity(quantity);
        System.out.println(donation);
        return "redirect:/form3";
    }

    @GetMapping("/form3")
    public String form3(Model model){
        model.addAttribute("institutions",institutions());
        model.addAttribute("institution", new Institution());
        return "form3";
    }

    @PostMapping("/form3")
    public String form3(@ModelAttribute("institution") Institution institution, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "error";
        }
        String name = institution.getName();
        donation.setInstitution(institutionService.findByName(name));
        System.out.println(donation);
        return "redirect:/form4";
    }

    @GetMapping("/form4")
    public String form4(Model model){
        return "form4";
    }
    @PostMapping("/form4")
    public String form4(@RequestParam(name="street")String street, @RequestParam(name="city")String city, @RequestParam(name = "zip_code")String zipCode,
                        @RequestParam(name="date")String date, @RequestParam(name="hour")String hour, @RequestParam(name="comment")String comment){
        donation.setStreet(street);
        donation.setCity(city);
        donation.setZipCode(zipCode);
        donation.setPickUpDate(LocalDate.parse(date));
        donation.setPickUpTime(LocalTime.parse(hour));
        donation.setPickUpComment(comment);
        donationService.saveDonation(donation);
        System.out.println(donation);
        return "x";
    }

    @ModelAttribute("institutions")
    public Collection<String> institutions(){
        return this.institutionService.findAll().stream().map(Institution::getName).collect(Collectors.toList());
    }

//    public List<Category> listMaker(boolean cat1, boolean cat2, boolean cat3, boolean cat4, boolean cat5){
//
//    }
}
