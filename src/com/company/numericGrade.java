package com.company;

import java.util.List;

/**
 * Created by Admin Banana on 4/2/2016.
 */
public class numericGrade extends grade{
    private float nResult;

    public void calcNResult(List<subject> subjectList){
        float weightGrade = 0;
        int credit = 0;
        for (subject sub:subjectList) {
            if (!(sub.getGrade().getsValue()=="S"||sub.getGrade().getsValue()=="U"||sub.getGrade().getsValue()=="W")){
                weightGrade += sub.getGrade().getnValue() * sub.getCredit();
                credit += sub.getCredit();
            }
        }
        setnResult(weightGrade/credit);
    }
    public float getnResult() {
        return nResult;
    }

    public void setnResult(float nResult) {
        this.nResult = nResult;
    }

}
