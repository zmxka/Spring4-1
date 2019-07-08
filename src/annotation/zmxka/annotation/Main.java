package annotation.zmxka.annotation;

import annotation.zmxka.annotation.controller.UserController;
import annotation.zmxka.annotation.repository.UserRepository;
import annotation.zmxka.annotation.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_annotation.xml");

        TestObject testObject = (TestObject) applicationContext.getBean("testObject");
        System.out.println(testObject);

        UserController userController = (UserController) applicationContext.getBean("userController");
        System.out.println(userController);

        UserRepository userRepository = (UserRepository) applicationContext.getBean("userRepository");
        System.out.println(userRepository);

        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);

        userController.execute();
    }
}
