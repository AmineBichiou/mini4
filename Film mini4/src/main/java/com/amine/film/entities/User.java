package com.amine.film.entities;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class User {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long user_id;
    private String username;
    private String password;
    private Boolean enabled;
    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id") ,
            inverseJoinColumns = @JoinColumn(name="role_id"))
    private List<Role> roles;
}
