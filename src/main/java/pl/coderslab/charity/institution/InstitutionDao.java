package pl.coderslab.charity.institution;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class InstitutionDao {
    @PersistenceContext
    EntityManager entityManager;

    public Institution findById (int id){
        return entityManager.find(Institution.class, id);
    }

    public List<Institution> findAll(){
        Query query = entityManager.createQuery("select i from Institution i");
        return query.getResultList();
    }

    public void saveInstitution(Institution institution){
        entityManager.persist(institution);
    }

    public void deleteInstitution(Institution institution){
        entityManager.remove(entityManager.contains(institution) ? institution : entityManager.merge(institution));
    }

    public void updateInstitution(Institution institution){
        entityManager.merge(institution);
    }
}
