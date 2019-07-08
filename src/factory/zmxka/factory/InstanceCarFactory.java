package factory.zmxka.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂的 方法
 * 先创建工程本身再调用工厂的实例方法发回Bean实例
 */
public class InstanceCarFactory {

    private Map<String, Car> carMap = null;

    public InstanceCarFactory(){

        carMap = new HashMap<>();
        carMap.put("audi",new Car("audi",20000));
        carMap.put("ford",new Car("ford",20000));
        carMap.put("ben",new Car("ben",20000));
    }

    public Car getCar(String name){

        return carMap.get(name);
    }
}
