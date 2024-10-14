package com.example.demo4.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Name")
    private String name;
    @Column(name = "lastName")
    private String lastname;
    @Column(name = "roomNumber")
    private String roomNumber;

}
