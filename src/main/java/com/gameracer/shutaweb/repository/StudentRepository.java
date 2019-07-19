package com.gameracer.shutaweb.repository;

import com.gameracer.shutaweb.modal.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
