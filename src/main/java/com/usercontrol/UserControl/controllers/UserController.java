package com.usercontrol.UserControl.controllers;
import com.usercontrol.UserControl.dao.UserDao;
import com.usercontrol.UserControl.models.User;
import com.usercontrol.UserControl.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    public UserController(){
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User getById(@PathVariable long id){
        return userService.getById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user){
      return userService.register(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User update(@PathVariable long id, @RequestBody User user){
       return userService.update(id, user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        userService.delete(id);
    }
}
