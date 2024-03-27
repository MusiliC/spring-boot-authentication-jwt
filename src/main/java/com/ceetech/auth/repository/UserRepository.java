package com.ceetech.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceetech.auth.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    Optional<UserEntity> findByEmail(String email);
}
