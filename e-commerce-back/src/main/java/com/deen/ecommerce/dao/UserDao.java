package com.deen.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deen.ecommerce.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
