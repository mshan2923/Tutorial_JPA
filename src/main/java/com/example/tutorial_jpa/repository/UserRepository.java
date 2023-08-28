package com.example.tutorial_jpa.repository;

import com.example.tutorial_jpa.entity.Users;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    //List<Users> findFirst2ByUsernameLikeOrderByIDDesc(String name);

}