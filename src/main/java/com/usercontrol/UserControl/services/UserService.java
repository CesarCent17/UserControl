package com.usercontrol.UserControl.services;

import com.usercontrol.UserControl.dao.UserDao;
import com.usercontrol.UserControl.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<User> getAll(){
        return userDao.getAll();
    };
    public User getById(long id){
        return userDao.getById(id);
    };
    public User register(User user){
        return userDao.register(user);
    };
    public User update(long id,User user){
        return userDao.update(id, user);
    };
    public void delete(long id){
        userDao.delete(id);
    };
}
