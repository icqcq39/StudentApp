package com.company;

/**
 * Created by Admin Banana on 4/2/2016.
 */
public class gradeValue {
    private String sValue;
    private float nValue;

    public gradeValue(String sValue, float nValue) {
        setsValue(sValue);
        setnValue(nValue);
    }

    public float tranStoN(String s){

    }

    public String getsValue() {
        return sValue;
    }

    public void setsValue(String sValue) {
        this.sValue = sValue;
    }

    public float getnValue() {
        return nValue;
    }

    public void setnValue(float nValue) {
        this.nValue = nValue;
    }
}
