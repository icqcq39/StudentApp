package com.company;

import java.util.StringJoiner;
import java.util.TreeMap;

/**
 * Created by Admin Banana on 3/30/2016.
 */
public class subject {
    private String name, code, teacher, place, section, grade;
    private int credit, score, midExam;
    private int A, Bb, B, Cc, C, D;

    public subject(String name, String code, String section, int credit) {
        setName(name);
        setCode(code);
        setSection(section);
        setCredit(credit);
        setScore(0);
        setMidExam(0);
        setGradeList();
        calcGrade();
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

    private void calcGrade(){
        TreeMap<Integer, String> gradeMap = new TreeMap<Integer, String>();
        gradeMap.put(0, "F");
        gradeMap.put(D, "D");
        gradeMap.put(C, "C");
        gradeMap.put(Cc, "C+");
        gradeMap.put(B, "B");
        gradeMap.put(Bb, "B+");
        gradeMap.put(A, "A");

        setGrade(gradeMap.floorEntry(getScore()).getValue());
    }

    public void getGradeList(){
        System.out.println("---------------");
        System.out.printf("A  >= %d%nB+ >= %d%nB  >= %d%nC+ >= %d%nC  >= %d%nD  >= %d%nF  <  %d%n",A, Bb, B, Cc, C, D, D);
        System.out.println("---------------");
    }

    public String getGrade() {
        calcGrade();
        return grade;
    }

    private void setGrade(String grade) {
        this.grade = grade;
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

    public void setGradeList(int A,int Bb,int B,int Cc,int C,int D){
        this.A = A;
        this.Bb = Bb;
        this.B = B;
        this.Cc = Cc;
        this.C = C;
        this.D = D;
    }

    public void setGradeList(){
        this.A = 80;
        this.Bb = 75;
        this.B = 70;
        this.Cc = 65;
        this.C = 60;
        this.D = 50;
    }

}
