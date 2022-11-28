package co.g2academy.day29assignment.day29assignment.repository;

import co.g2academy.day29assignment.day29assignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
