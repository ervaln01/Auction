package com.orangeteam.auc.rep;

import com.orangeteam.auc.models.Value;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueRepository extends CrudRepository<Value, Long> {
}
