package com.company;
import java.util.ArrayList;
import java.util.List;


public class GradeCatalogue {

    //State
    private String Schoolname;
    private List<Student> Students;


    //Constructor
    public GradeCatalogue(String schoolName, List<Student> students){
        Schoolname = schoolName;
        Students = students;
    }

    //Behaviour


    public List<Student> getStudents() {
        return Students;
    }

    public List<Student> addStudent(Student student){
        Students.add(student);
        return Students;
    }
    public List<Student> removeStudent(Student student){
        Students.remove(student);
        return Students;
    }
}
