package com.usercontrol.UserControl.dao;
import com.usercontrol.UserControl.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional
@Repository
public class UserDao implements IUserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<User> getAll() {
        String hql = "FROM User as u";
        return (List<User>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public User register(User user) {
        entityManager.merge(user);
        return user;
    }

    @Transactional
    @Override
    public User update(long id, User user) {
        entityManager.merge(user);
        return user;
    }

    @Transactional
    @Override
    public void delete(long id) {
        User user = getById(id);
        entityManager.remove(user);
    }
}
