package net.javaguides.ems.service;

import net.javaguides.ems.dto.UserDto;

// This is a service interface for user-related operations
public interface UserService {

    // Creates a user based on the provided UserDto and returns the created UserDto
    UserDto createUser(UserDto userDto);
}