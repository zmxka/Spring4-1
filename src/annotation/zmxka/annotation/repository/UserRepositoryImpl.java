package annotation.zmxka.annotation.repository;

import annotation.zmxka.annotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "userRepository")
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private TestObject testObject;

    @Override
    public void save() {
        System.out.println("UserRepositoryImpl save...");
        System.out.println(testObject);
    }
}
