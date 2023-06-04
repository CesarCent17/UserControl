package com.usercontrol.UserControl.controllers;
import com.usercontrol.UserControl.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    List<User> users = new ArrayList<>();
    public UserController(){

        User userC = new User();
        userC.setId(1);
        userC.setNombre("Cesar");
        userC.setApellido("Centurion");
        userC.setEmail("cesar@example.com");
        userC.setFechaNac(LocalDate.of(2000, 10, 17));
        users.add(userC);
        User userL = new User();

        userL.setId(2);
        userL.setNombre("Lady");
        userL.setApellido("Vera");
        userL.setEmail("lady@example.com");
        userL.setFechaNac(LocalDate.of(2002, 07, 24));
        users.add(userL);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getAll(){
        return users;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User getById(@PathVariable long id){

        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id){
                return users.get(i);
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user){
        users.add(user);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User update(@PathVariable long id, @RequestBody User user){
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id){
                users.get(i).setEmail(user.getEmail());
                return users.get(i);
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId() == id){
                users.remove(i);
                return;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
    }
}
