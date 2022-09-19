package pl.coderslab.charity.Category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryDao categoryDao;

    public Category findById(long id){
        return categoryDao.findById(id);
    }

    public List<Category> findAll(){
        return categoryDao.findAll();
    }

    public void saveCategory(Category category){
        categoryDao.saveCategory(category);
    }

    public void deleteCategory(Category category){
        categoryDao.deleteCategory(category);
    }

    public void updateCategory(Category category){
        categoryDao.updateCategory(category);
    }
}
