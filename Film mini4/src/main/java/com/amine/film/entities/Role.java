package com.amine.film.entities;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Role {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long role_id;
    private String role;
}
