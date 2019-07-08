package life.zmxka.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_cycle.xml");

        Car car = applicationContext.getBean(Car.class);

        System.out.println(car);

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
