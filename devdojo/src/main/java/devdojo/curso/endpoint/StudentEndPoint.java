package devdojo.curso.endpoint;

import devdojo.curso.model.Student;
import devdojo.curso.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("students")
@AllArgsConstructor
public class StudentEndPoint {
    private final StudentRepository studentDAO;

    @GetMapping
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(studentDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") Long id) {
        Optional<Student> student = studentDAO.findById(id);
        if (student == null) {
            /*return  new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);*/
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student) {
        return  new ResponseEntity<>(studentDAO.save(student), HttpStatus.OK);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        studentDAO.deleteById(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Student student) {
        studentDAO.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
