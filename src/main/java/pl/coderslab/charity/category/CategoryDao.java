package pl.coderslab.charity.category;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class CategoryDao {
    @PersistenceContext
    EntityManager entityManager;

    public Category findById(long id) {
        return entityManager.find(Category.class, id);
    }

    public List<Category> findAll() {
        Query query = entityManager.createQuery("select c from Category c");
        return query.getResultList();
    }

    public void saveCategory(Category category) {
        entityManager.persist(category);
    }

    public void deleteCategory(Category category) {
        entityManager.remove(entityManager.contains(category) ? category : entityManager.merge(category));
    }

    public void updateCategory(Category category) {
        entityManager.merge(category);
    }
}
