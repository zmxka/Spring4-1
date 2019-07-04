package net.zmxka.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zmxka.auto.Address;
import org.zmxka.auto.Person;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_relation.xml");

        Address address = (Address) applicationContext.getBean("address");

        System.out.println(address);

        address = (Address) applicationContext.getBean("address2");

        System.out.println(address);

        address = (Address) applicationContext.getBean("address3");

        System.out.println(address);

//        address4不能被实例化 这里编辑器报错所以先注释掉 其实是可以运行的
//
//        address = (Address) applicationContext.getBean("address5");
//
//        System.out.println(address);

        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);
    }
}
