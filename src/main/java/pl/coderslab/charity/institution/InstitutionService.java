package pl.coderslab.charity.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class InstitutionService {
    private final InstitutionDao institutionDao;

    public Institution findById(int id){
        return institutionDao.findById(id);
    }

    public List<Institution> findAll(){
        return institutionDao.findAll();
    }

    public Institution findByName(String name){
        return institutionDao.findByName(name);
    }

    public void saveInstitution(Institution institution){
        institutionDao.saveInstitution(institution);
    }

    public void deleteInstitution(Institution institution){
        institutionDao.deleteInstitution(institution);
    }

    public void updateInstitution(Institution institution){
        institutionDao.updateInstitution(institution);
    }
}
