package com.orangeteam.auc.rep;

import com.orangeteam.auc.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
