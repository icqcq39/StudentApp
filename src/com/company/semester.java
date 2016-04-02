package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin Banana on 3/30/2016.
 */
public class semester {
    private String title;
    private int totalCredit;
    private List<subject> subjectList = new ArrayList<subject>();
    private numericGrade semGrade = new numericGrade();


    public semester(String title) {
        setTitle(title);
        setTotalCredit(0);
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

    public numericGrade getSemGrade() {
        semGrade.calcNResultSUB(subjectList);
        return semGrade;
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
                ", semGrade=" + getSemGrade().getnResult() +
                '}';
    }
}
