package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin Banana on 3/30/2016.
 */
public class student {
    private String fullname, name, surname, faculty,scode;
    private int syear;
    private float sGrade;
    List<semester> semesterList = new ArrayList<>();

    public student(String fullname, String faculty, String scode) {
        setFullname(fullname);
        setFaculty(faculty);
        setScode(scode);
    }

    public semester getSemster(int index){
        return  semesterList.get(index);
    }

    public semester getsemester(String title){
        for (int i = 0; i < semesterList.size(); i++) {
            if (semesterList.get(i).getTitle() == title){
                return semesterList.get(i);
            }
        }
        System.out.println("This subject not found.");
        return semesterList.get(0);
    }

    public void printsemesterList(){
        for (semester sem:semesterList) {
            System.out.println(sem);
        }
    }
    public void addSemester(String title){
        if (checkSemester(title)){
            semesterList.add(new semester(title));
        }else {
            System.out.println("There is already this semester");
        }

    }

    private boolean checkSemester(String title){
        for (semester sem:semesterList) {
            if (sem.getTitle() == title){
                return false; //false if conflicted
            }
        }
        return true;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        setName(fullname.substring(0,fullname.indexOf(' ')).toUpperCase());
        setSurname(fullname.substring(fullname.indexOf(' ')+1).toUpperCase().trim());
        this.fullname = getName() + " " + getSurname();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        if (scode.length()==9){
            this.scode = scode;
        } else {
            this.scode = "000000000";
        }
        setSyear(Integer.parseInt(this.scode.substring(0,2)));
    }

    public int getSyear() {
        return syear;
    }

    private void setSyear(int syear) {
        this.syear = syear;
    }

    @Override
    public String toString() {
        return "student{" +
                "fullname='" + fullname + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", scode=" + scode +
                ", syear=" + syear +
                '}';
    }
}
