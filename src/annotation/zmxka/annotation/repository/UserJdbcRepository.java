package annotation.zmxka.annotation.repository;

import org.springframework.stereotype.Repository;

//@Repository("userRepository")
@Repository
public class UserJdbcRepository implements UserRepository {

    @Override
    public void save() {
        System.out.println("UserJdbcRepository save .....");
    }
}
