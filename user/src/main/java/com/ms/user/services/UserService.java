package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducer;
import com.ms.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserRepository userRepository;
    final UserProducer userProducer;
    //Criando um ponto de injecao, assim poderemos usar o UserRepository

    //Construtor
    public UserService(UserRepository userRepository, UserProducer userProducer) {
        this.userRepository = userRepository;
        this.userProducer = userProducer;
    }

    //Salvar o usuario no banco
    @Transactional
    public UserModel save(UserModel userModel){
        userModel = userRepository.saveAndFlush(userModel);
        userProducer.publishMessageEmail(userModel);
        return userModel;
    }


}
