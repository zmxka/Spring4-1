package factory.zmxka.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_factory.xml");

        Car car1 = (Car) applicationContext.getBean("car1");
        System.out.println(car1);

        Car car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car2);

        Car car3 = (Car) applicationContext.getBean("car3");
        System.out.println(car3);
    }
}
