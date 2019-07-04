package cn.zmxka.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        Preson preson = (Preson) applicationContext.getBean("preson4");

        System.out.println(preson);

        NewPreson newPreson = (NewPreson) applicationContext.getBean("newPreson");

        System.out.println(newPreson);
    }
}
