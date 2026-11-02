package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StudentServiceTest extends TestCase {


    @Test
    public void getstudents(){
        StudentService studentService = new StudentService();
        List<Student>listofStudents = studentService.getAllStudents();
boolean actualResults = listofStudents.isEmpty();
assertTrue(actualResults);

    }
    @Test
    public void getstudents2() {
        StudentService studentService = new StudentService();
        Student student = new Student(235, "Kagiso");

        List<Student> listofStudents = studentService.getAllStudents();
        studentService.addStudents(student);
        boolean actualResults = listofStudents.isEmpty();
        assertTrue(actualResults);
    }
}