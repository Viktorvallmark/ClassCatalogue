package com.company;
import java.util.ArrayList;
import java.util.List;



public class Gradebook {

    //State
    private List<Integer> Grades;

    //Constructor
    public Gradebook(List<Integer> grades) {
        Grades = grades;
    }

    //Behaviour

    public float AverageGrade(List<Integer> grades){
        float total = 0.0F;
        for(int i : grades){
            total += i; ;
        }
        return (total / (float) grades.size());
    }


    public int HighestGrade(List<Integer> grades){
        int highestGradeSoFar = grades.get(0);
        for(int i = 0; i < grades.size(); i++){
            if(i > highestGradeSoFar){
                highestGradeSoFar = i;
            }
        }
        return highestGradeSoFar;
    }
    public int LowestGrade(List<Integer> grades){
        int lowestGradeSoFar = grades.get(0);
        for(int i = 0; i < grades.size(); i++){
            if(i < lowestGradeSoFar){
                lowestGradeSoFar = i;
            }
        }
        return lowestGradeSoFar;
    }
    public List<Integer> addGrade(int grade){
        Grades.add(grade);
        return Grades;
    }



}
