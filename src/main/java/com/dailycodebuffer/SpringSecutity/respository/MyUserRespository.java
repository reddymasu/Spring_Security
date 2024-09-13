package com.dailycodebuffer.SpringSecutity.respository;

import com.dailycodebuffer.SpringSecutity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRespository extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByUsername(String name);

}
