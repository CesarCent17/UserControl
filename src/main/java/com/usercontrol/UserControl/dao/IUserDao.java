package com.usercontrol.UserControl.dao;

import com.usercontrol.UserControl.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public interface IUserDao {
    List<User> getAll();
    User getById(long id);
    User register(User user);
    User update(long id,User user);
    void delete(long id);
}
