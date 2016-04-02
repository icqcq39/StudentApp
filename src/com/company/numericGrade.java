package com.company;

import java.util.List;

/**
 * Created by Admin Banana on 4/2/2016.
 */
public class numericGrade extends grade{
    private float nResult;
    private int credit;

    public void calcNResult(List<subject> subjectList){
        for (subject sub:subjectList) {
            if (!(sub.getGrade()=="S"||sub.getGrade()=="U"||sub.getGrade()=="W")){

            }
        }
    }
    public float getnResult() {
        return nResult;
    }

    public void setnResult(float nResult) {
        this.nResult = nResult;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
