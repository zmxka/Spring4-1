package factory.zmxka.factory;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanImpl implements FactoryBean<Car> {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return bean实例
     * @throws Exception
     */
    @Override
    public Car getObject() throws Exception {

        return new Car(name,50000);
    }

    /**
     *
     * @return 返回bean类型
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     *
     * @return 返回是否单一实例 见作用域
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
