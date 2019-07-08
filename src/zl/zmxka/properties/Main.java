package zl.zmxka.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zmxka.auto.Person;

import javax.sql.DataSource;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_properties.xml");

        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");

        System.out.println(dataSource);
    }
}
