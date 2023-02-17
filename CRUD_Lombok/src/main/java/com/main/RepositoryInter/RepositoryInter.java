package com.main.RepositoryInter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Student;

@Repository

public interface RepositoryInter extends CrudRepository<Student, Integer>{

}
