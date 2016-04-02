package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin Banana on 3/30/2016.
 */
public class semester {
    private String title;
    private int totalCredit;
    private numericGrade semGrade;
    private List<subject> subjectList = new ArrayList<subject>();


    public semester(String title) {
        setTitle(title);
        setTotalCredit(0);
    }

    private void coutCalcCredit(){
        int sum=0;
        for (subject sub:subjectList) {
            if (sub.getGrade()=="S"||sub.getGrade()=="U"||sub.getGrade()=="W"){
                sum += sub.getCredit();
            }
        }
        semGrade.setCredit(getTotalCredit() - sum);
    }
    public void addSubject(String name, String code, String section, int credit){
        subjectList.add(new subject(name,code,section,credit));
        addTotalCredit(credit);
    }

    public void deleteSubject(String delcode){
        for (int i = 0; i < subjectList.size(); i++) {
            if (subjectList.get(i).getCode() == delcode){
                substractTotalCredit(subjectList.get(i).getCredit());
                subjectList.remove(i);
                break;
            }
        }

    }

    public subject getSubject(int index){
        return  subjectList.get(index);
    }

    public subject getSubject(String code){
        for (int i = 0; i < subjectList.size(); i++) {
            if (subjectList.get(i).getCode() == code){
                return subjectList.get(i);
            }
        }
        System.out.println("This subject not found.");
        return subjectList.get(0);
    }

    private void calcSemGrade(){
        float sum = 0.0f;
        for (subject s:subjectList) {
            sum += gradeTrans(s.getGrade())*s.getCredit();
        }
        setSemGrade(sum/(float)totalCredit);
    }

    private float gradeTrans(String grade){
        if (grade=="A") return 4.0f;
        else if(grade=="B+") return 3.5f;
        else if(grade=="B") return 3.0f;
        else if(grade=="C+") return 2.5f;
        else if(grade=="C") return 2.0f;
        else if(grade=="D") return 1.0f;
        else if(grade=="F") return 0.0f;
        else return 1.f;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    private void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public void printSubjects(){
        for (subject list: subjectList) {
            System.out.println(list);
        }
    }
    private void addTotalCredit(int credit){
        this.totalCredit += credit;
    }

    private void substractTotalCredit(int credit){
        this.totalCredit -= credit;
    }

    public float getSemGrade() {
        calcSemGrade();
        semGrade = ((int)(semGrade*100))/100f;
        return semGrade;
    }

    public void setSemGrade(float semGrade) {
        this.semGrade = semGrade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "semester{" +
                "title='" + title + '\'' +
                ", totalCredit=" + totalCredit +
                ", semGrade=" + getSemGrade() +
                '}';
    }
}
