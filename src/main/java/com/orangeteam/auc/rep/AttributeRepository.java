package com.orangeteam.auc.rep;

import com.orangeteam.auc.models.Attribute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends CrudRepository<Attribute, Long> {
}
