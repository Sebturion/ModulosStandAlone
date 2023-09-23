package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.UserDto;
import net.javaguides.ems.entity.User;

public class UserMapper {

    // Maps a User entity to a UserDto
    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),         // Set the UserDto's id from the User entity's id
                user.getFirstName(),  // Set the UserDto's firstName from the User entity's firstName
                user.getLastName(),   // Set the UserDto's lastName from the User entity's lastName
                user.getEmail()       // Set the UserDto's email from the User entity's email
        );
    }

    // Maps a UserDto to a User entity
    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),         // Set the User entity's id from the UserDto's id
                userDto.getFirstName(),  // Set the User entity's firstName from the UserDto's firstName
                userDto.getLastName(),   // Set the User entity's lastName from the UserDto's lastName
                userDto.getEmail()       // Set the User entity's email from the UserDto's email
        );
    }
}