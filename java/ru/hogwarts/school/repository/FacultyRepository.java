package java.ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.ru.hogwarts.school.model.Faculty;
import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findByNameIgnoreCaseOrColorIgnoreCase(String name, String color);

    List<Faculty> findByColorIgnoreCase(String red);

    List<Faculty> findByNameIgnoreCase(String gryffindor);
}