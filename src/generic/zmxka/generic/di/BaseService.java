package generic.zmxka.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

    @Autowired
    protected BaseRepositoty<T> repositoty;

    public  void add(){

        System.out.println("add...");
        System.out.println(repositoty);
    }
}
