package cn.zmxka.list;

import java.util.List;

public class Preson {

    private String name;
    private int age;
    private List<Car> carList;

    public Preson() {
    }

    public Preson(String name, int age, List<Car> carList) {
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

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                '}';
    }
}
