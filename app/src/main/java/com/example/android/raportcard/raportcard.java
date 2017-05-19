
package com.example.android.raportcard;

import java.util.ArrayList;

public class raportcard {

    // ArrayList storing values
    private ArrayList<Double> Grades = new ArrayList<Double>();

    //ArrayList storing subjects
    private ArrayList<String> Subjects = new ArrayList<String>();

    //Create a new object.
    public raportcard(double mathsGrade, double biologyGrade, double PsychologyGrade, double ITGrade) {

        Subjects.add(0, "Maths");
        Subjects.add(1, "Biology");
        Subjects.add(2, "Psychology");
        Subjects.add(3, "IT");

        Grades.add(0, mathsGrade);
        Grades.add(1, biologyGrade);
        Grades.add(2, PsychologyGrade);
        Grades.add(3, ITGrade);
    }

    //Set the grade for Maths
    private void setMathsGrade(double grade) {
        Grades.set(0, grade);
    }

    //Get the grade for Maths
    private double getMathsGrade() {
        double grade = Grades.get(0);
        return grade;
    }

    //Set the grade for Biology
    private void setBiologyGrade(double grade) {
        Grades.set(1, grade);
    }

    //Get the grade for Biology
    private double getBiologyGrade() {
        double grade = Grades.get(1);
        return grade;
    }

    //Set the grade for Psychology
    private void setPsychologyGrade(double grade) {
        Grades.set(2, grade);
    }

    //Get the grade for Psychology
    private double getPsychologyGrade() {
        double grade = Grades.get(2);
        return grade;
    }

    //Set the grade for IT.
    private void setITGrade(double grade) {
        Grades.set(3, grade);
    }

    //Get the grade for IT
    private double getITGrade() {
        double grade = Grades.get(3);
        return grade;
    }

    //Final grade
    private double FinalGrade;

    public double getFinalGrade() {
        FinalGrade = 0.0;
        for (int i = 0; i < Grades.size(); i++) {
            double grade = Grades.get(i);
            FinalGrade = FinalGrade + grade;
        }
        FinalGrade = FinalGrade / Grades.size();
        return FinalGrade;
    }

    //String with all grades
    private String allGrades;

    @Override
    public String toString() {
        allGrades = "";
        for (int i = 0; i < Grades.size(); i++) {
            Double grade = Grades.get(i);
            String subject = Subjects.get(i);
            allGrades = allGrades + subject + ": " + grade + "\n";
        }
        allGrades = allGrades + "Final Grade: " + FinalGrade;
        return allGrades;
    }
}

