package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception{
        // write your code here
        List<Student> stud = new ArrayList<>();
        try (Scanner listOfNames = new Scanner(new File("C:\\Users\\Viktor\\IdeaProjects\\Classroom.java\\src\\com\\company\\list-of-names.txt"))){
            int count = listOfNames.nextInt();
            for(int i = 0; i < count; i++){
                List<Integer> grades = new ArrayList<>();
                if(listOfNames.hasNextInt()){
                    int ID = listOfNames.nextInt();
                    String studentName = listOfNames.next();
                    int grade1 = listOfNames.nextInt();
                    int grade2 = listOfNames.nextInt();
                    int grade3 = listOfNames.nextInt();
                    int grade4 = listOfNames.nextInt();
                    grades.add(grade1);
                    grades.add(grade2);
                    grades.add(grade3);
                    grades.add(grade4);
                    stud.add(new Student(ID, studentName, (Gradebook) grades));
                }


            }

        }
        catch (IOException e){
            System.err.println("Error when reading file");
            e.printStackTrace();
        }

        GradeCatalogue gc1 = new GradeCatalogue("Grit", stud);
        System.out.println(gc1.getStudents());

    }

}




