package com.example.demo4.repository;

import com.example.demo4.Model.model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface modelRepository  extends JpaRepository<model,Long>{
    model findByName(String name);
    model findByLastname(String lastName);
    model findByRoomNumber(String roomNumber);
    model findById(long id);
}
