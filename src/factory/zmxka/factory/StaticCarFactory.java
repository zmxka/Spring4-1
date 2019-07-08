package factory.zmxka.factory;


import java.util.HashMap;
import java.util.Map;

/*
* 静态工程方法: 直接调用某一个类的静态方法就可以返回Bean的实例
* */
public class StaticCarFactory {

    private static Map<String, Car> carMap = new HashMap<>();

    static {
        carMap.put("audi",new Car("audi",20000));
        carMap.put("ford",new Car("ford",20000));
        carMap.put("ben",new Car("ben",20000));
    }

    public static Car getCar(String name){
        return carMap.get(name);
    }

}
