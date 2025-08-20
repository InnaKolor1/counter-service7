package java.ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import java.ru.hogwarts.school.model.Faculty;
import java.ru.hogwarts.school.repository.FacultyRepository;
import java.util.List;


@Service
public class FacultyService {
    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public List<Faculty> findByNameOrColor(String nameOrColor) {
        return facultyRepository.findByNameIgnoreCaseOrColorIgnoreCase(nameOrColor, nameOrColor);
    }
}