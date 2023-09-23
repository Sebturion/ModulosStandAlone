package net.javaguides.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier for the user

    @Column(name = "first_name")
    private String firstName; // User's first name

    @Column(name = "last_name")
    private String lastName; // User's last name

    @Column(name = "email_id", nullable = false, unique = true)
    private String email; // User's email, which is unique and cannot be null

}