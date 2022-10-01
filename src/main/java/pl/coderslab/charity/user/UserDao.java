package pl.coderslab.charity.user;

import org.springframework.stereotype.Repository;
import pl.coderslab.charity.institution.Institution;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class UserDao {
    @PersistenceContext
    EntityManager entityManager;

    public User findById (int id){
        return entityManager.find(User.class, id);
    }

    public List<User> findAll(){
        Query query = entityManager.createQuery("select u from User u");
        return query.getResultList();
    }

    public User findByEmail (String email){
        return (User) entityManager.createQuery("select u from User u where u.email = :email")
                .setParameter("email",email)
                .getSingleResult();
    }

    public void saveUser(User user){
        entityManager.persist(user);
    }

    public void deleteUser(User user){
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }

    public void updateUser(User user){
        entityManager.merge(user);
    }
}
