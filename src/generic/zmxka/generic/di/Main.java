package generic.zmxka.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_gengric.xml");

        UserService userService = applicationContext.getBean(UserService.class);
        userService.add();
    }
}
