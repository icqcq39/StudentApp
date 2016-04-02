package com.company;

import java.util.List;

/**
 * Created by Admin Banana on 4/2/2016.
 */
public class numericGrade extends grade{
    private float nResult;
    private int semCredit;

    public void calcNResultSUB(List<subject> subjectList){
        float weightGrade = 0;
        semCredit = 0;
        for (subject sub:subjectList) {
            if (!(sub.getGrade().getsValue()=="S"||sub.getGrade().getsValue()=="U"||sub.getGrade().getsValue()=="W")){
                weightGrade += sub.getGrade().getnValue() * sub.getCredit();
                semCredit += sub.getCredit();
            }
        }
        setnResult(weightGrade/semCredit);
    }

    public void calcNResultSEM(List<semester> semesterList){
        float weightGrade = 0;
        semCredit = 0;
        for (semester sem:semesterList) {
            weightGrade += sem.getSemGrade().getnResult()*sem.getSemGrade().semCredit;
            semCredit += sem.getSemGrade().getSemCredit();
        }
        setnResult(weightGrade/semCredit);
    }

    public int getSemCredit() {
        return semCredit;
    }

    public float getnResult() {
        return nResult;
    }

    public void setnResult(float nResult) {
        this.nResult = nResult;
    }

}
