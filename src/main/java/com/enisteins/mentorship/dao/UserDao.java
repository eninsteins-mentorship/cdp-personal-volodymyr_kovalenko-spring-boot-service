package com.enisteins.mentorship.dao;

import com.enisteins.mentorship.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

}
