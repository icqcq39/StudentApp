package com.company;

/**
 * Created by Admin Banana on 4/2/2016.
 */
public class normalGrade extends grade {
    private gradeValue sResult;
    private int gradeRange [] = {0,50,55,60,65,70,75,80};


    public normalGrade(int score) {
        scoreUpdate(score);
    }

    public normalGrade() {
    }

    public void  scoreUpdate(int score){
        calcSResult(score);
    }


    private void calcSResult(int score){
        setsResult(gradeListMap.floorEntry(score).getValue());
    }
    public void setGradeRange(int A,int Bb,int B,int Cc,int C,int Dd,int D){
        gradeRange[7] = A;
        gradeRange[6] = Bb;
        gradeRange[5] = B;
        gradeRange[4] = Cc;
        gradeRange[3] = C;
        gradeRange[2] = Dd;
        gradeRange[1] = D;
    }

    public gradeValue getsResult() {
        return sResult;
    }

    public void setsResult(String sResult) {
        this.sResult.setsValue(sResult);
    }
    public void setsResult(gradeValue OResult) {
        this.sResult = OResult;
    }
}
