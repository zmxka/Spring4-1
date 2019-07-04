package edu.zmxka.scope;

import com.zmxka.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zmxka.auto.Address;
import org.zmxka.auto.Person;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean_scope.xml");

        Car car1 = (Car) applicationContext.getBean("car");
        Car car2 = (Car) applicationContext.getBean("car");
        System.out.println(car1 == car2);


        car1 = (Car) applicationContext.getBean("car2");
        car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car1 == car2);
    }
}
