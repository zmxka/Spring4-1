package annotation.zmxka.annotation.services;

import annotation.zmxka.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    @Autowired
//    @Qualifier("userJdbcRepository")
    private UserRepository userRepository;

    /**
     * 上下都可以
     * 如果UserRepository和bean声明的变量名一致也可以制动装配同类型的多个bean
     */
    @Autowired
//    @Qualifier("userJdbcRepository")
    public void setUserRepository(@Qualifier("userJdbcRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(){

        userRepository.save();
        System.out.println("UserService add...");
    }
}
