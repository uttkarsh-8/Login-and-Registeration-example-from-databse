package com.registerandlogin.registerationandllogging.repository;

import com.registerandlogin.registerationandllogging.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String name);
}
