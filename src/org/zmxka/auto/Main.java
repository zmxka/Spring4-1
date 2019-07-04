package org.zmxka.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_auto.xml");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        person = (Person) applicationContext.getBean("person2");
        System.out.println(person);

        person = (Person) applicationContext.getBean("person3");
        System.out.println(person);
    }
}
