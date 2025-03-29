//package com.ex.WhatsApp.service;


package com.ex.WhatsApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.WhatsApp.dto.UserDto;
import com.ex.WhatsApp.entity.User;
import com.ex.WhatsApp.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserDto userDto) {
        User user = new User();
        //user.setFirstName(userDto.toString());
        //user.setLastName(userDto.toString());
        //user.setEmail(userDto.toString());
        userRepository.save(user);
    }
}

