package com.em.SBValidateExpHandling.Service;

import com.em.SBValidateExpHandling.Model.UserInformation;
import com.em.SBValidateExpHandling.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserInformation saveInfo(UserInformation userInformation) {
        return userRepository.save(userInformation);
    }

    @Override
    public List<UserInformation> displayInfo() {
        return userRepository.findAll();
    }
}
