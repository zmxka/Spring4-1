package annotation.zmxka.annotation.controller;

import annotation.zmxka.annotation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void execute(){

        userService.add();
        System.out.println("UserController execute...");
    }
}
