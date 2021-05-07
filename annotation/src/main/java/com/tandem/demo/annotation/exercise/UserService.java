package com.tandem.demo.annotation.exercise;

@Component
public class UserService {

    @Autowire
    private UserRepository userRepository;

    public String queryUserNameById(int id) {
        return userRepository.getNameById(id);
    }
}
