package com.company;

import java.lang.reflect.Array;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Admin Banana on 4/1/2016.
 */
public class grade {
    private int credit;

    TreeMap<Integer, gradeValue> gradeListMap = new TreeMap<Integer, gradeValue>();
    protected int gradeRange [] = {0,50,55,60,65,70,75,80};

    public grade() {
        setGradeListMap();
    }

    private void setGradeListMap(){
        gradeListMap.put(gradeRange[0], new gradeValue("F",0.0f));
        gradeListMap.put(gradeRange[1], new gradeValue("D",1.0f));
        gradeListMap.put(gradeRange[2], new gradeValue("D+",1.5f));
        gradeListMap.put(gradeRange[3], new gradeValue("C",2.0f));
        gradeListMap.put(gradeRange[4], new gradeValue("C+",2.5f));
        gradeListMap.put(gradeRange[5], new gradeValue("B",3.0f));
        gradeListMap.put(gradeRange[6], new gradeValue("B+",3.5f));
        gradeListMap.put(gradeRange[7], new gradeValue("A",4.0f));
    }

    public void getGradeRange(){
        System.out.println("---------------");
        for (int i = 0; i < gradeRange.length; i++) {
            System.out.printf("%2c ----- %2d", 'A'+i, gradeRange[i]);
        }
        System.out.println("---------------");
    }
    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

}
