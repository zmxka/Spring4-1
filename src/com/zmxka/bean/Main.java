package com.zmxka.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);

        car = (Car) applicationContext.getBean("car2");
        System.out.println(car);

        car = (Car) applicationContext.getBean("car3");
        System.out.println(car);

        Preson preson = (Preson) applicationContext.getBean("preson");
        System.out.println(preson);

        preson = (Preson) applicationContext.getBean("preson2");
        System.out.println(preson);

        preson = (Preson) applicationContext.getBean("preson5");
        System.out.println(preson);

        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
