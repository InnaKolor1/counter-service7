package java.ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.ru.hogwarts.school.model.Student;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByAgeBetween(int minAge, int maxAge);
    List<Student> findByFacultyId(Long facultyId);
}
