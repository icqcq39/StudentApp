package com.company;

import java.util.TreeMap;

/**
 * Created by Admin Banana on 3/30/2016.
 */
public class subject {
    private String name, code, teacher, place, section;
    private int credit, score, midExam;
    private normalGrade grade;

    public subject(String name, String code, String section, int credit) {
        setName(name);
        setCode(code);
        setSection(section);
        setCredit(credit);
        setScore(0);
        setMidExam(0);
        grade.scoreUpdate(0);
    }

    @Override
    public String toString() {
        return "subject{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", teacher='" + teacher + '\'' +
                ", place='" + place + '\'' +
                ", section='" + section + '\'' +
                ", grade='" + getGrade() + '\'' +
                ", credit=" + credit +
                '}';
    }

    public gradeValue getGrade() {
        return grade.getsResult();
    }


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getNC(){
        return getCode() + " " + getName();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMidExam() {
        return midExam;
    }

    public void setMidExam(int midExam) {
        this.midExam = midExam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

}
