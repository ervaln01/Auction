package com.orangeteam.auc.rep;

import com.orangeteam.auc.models.AttrList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttrListRepository extends CrudRepository<AttrList, Long> {
}
