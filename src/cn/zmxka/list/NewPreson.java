package cn.zmxka.list;

import java.util.List;
import java.util.Map;

public class NewPreson {

    private String name;
    private int age;
    private Map<String, Car> carList;

    public NewPreson() {
    }

    public NewPreson(String name, int age, Map<String, Car> carList) {
        this.name = name;
        this.age = age;
        this.carList = carList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Car> getCarList() {
        return carList;
    }

    public void setCarList(Map<String, Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "NewPreson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                '}';
    }
}
