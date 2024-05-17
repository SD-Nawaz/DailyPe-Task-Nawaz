package com.durgasoft.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durgasoft.beans.User;

public interface UserRepo extends JpaRepository<User, UUID> {

}
