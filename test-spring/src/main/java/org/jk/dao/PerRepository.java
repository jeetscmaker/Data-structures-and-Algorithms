package org.jk.dao;

import org.jk.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerRepository extends JpaRepository<Person, Long>{

}
