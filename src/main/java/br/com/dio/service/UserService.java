package br.com.dio.service;

import br.com.dio.model.User;
import br.com.dio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user){
        String pass = user.getPassword();

        user.setPassword(encoder.encode(pass));
        userRepository.save(user);
    }

}
