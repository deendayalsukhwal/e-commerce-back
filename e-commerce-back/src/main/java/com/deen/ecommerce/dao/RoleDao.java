package com.deen.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deen.ecommerce.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
