package com.company;



public class Student {
    //State


    private int ID;
    private String studentName;
    private Gradebook gradebook;


    //Constructor

    public Student(int Id, String stName, Gradebook grades) {
        ID = Id;
        studentName = stName;
        gradebook = grades;

    }

    public Student(int Id){
        ID = Id;
    }
    public Student(int Id, String stName){
        ID = Id;
        studentName = stName;
    }

    public Student() {

    }


    //Behaviour

    public int getID(){
        return ID;
    }

    public String getName(){
        return studentName;
    }

    public Gradebook getGrades(){
        return gradebook;
        }

    }




