package com.harsh.studentmanagement.Repository;
import com.harsh.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {

}
