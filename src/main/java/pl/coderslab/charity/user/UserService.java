package pl.coderslab.charity.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionDao;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;

    public User findById(int id){
        return userDao.findById(id);
    }

    public List<User> findAll(){
        return userDao.findAll();
    }

    public User findByEmail(String email){
        return userDao.findByEmail(email);
    }

    public void saveUser(User user){
        userDao.saveUser(user);
    }

    public void deleteUser(User user){
        userDao.deleteUser(user);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }
}
