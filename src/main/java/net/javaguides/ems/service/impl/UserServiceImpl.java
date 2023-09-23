package net.javaguides.ems.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.UserDto;
import net.javaguides.ems.entity.User;
import net.javaguides.ems.mapper.UserMapper;
import net.javaguides.ems.repository.UserRepository;
import net.javaguides.ems.service.UserService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    // Implementation of the createUser method from the UserService interface
    @Override
    public UserDto createUser(UserDto userDto) {
        // Map the UserDto to a User entity
        User user = UserMapper.mapToUser(userDto);

        // Save the User entity to the UserRepository and get the saved User
        User saveUser = userRepository.save(user);

        // Map the saved User back to a UserDto and return it
        return UserMapper.mapToUserDto(saveUser);
    }
}