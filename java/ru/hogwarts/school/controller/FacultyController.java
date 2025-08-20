package java.ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.ru.hogwarts.school.model.Faculty;
import java.ru.hogwarts.school.service.FacultyService;
import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Faculty>> searchByNameOrColor(@RequestParam String nameOrColor) {
        return ResponseEntity.ok(facultyService.findByNameOrColor(nameOrColor));
    }
}