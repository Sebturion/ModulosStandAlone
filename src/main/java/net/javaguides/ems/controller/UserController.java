package net.javaguides.ems.controller;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.UserDto;
import net.javaguides.ems.entity.User;
import net.javaguides.ems.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    // Defines a REST API endpoint for creating a user
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        // Call the userService to create a user based on the provided UserDto
        UserDto savedUser = userService.createUser(userDto);

        // Return a ResponseEntity with the created UserDto and HTTP status code 201 (Created)
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}