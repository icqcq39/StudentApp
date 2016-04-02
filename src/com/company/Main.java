package com.company;

public class Main {

    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        student s1 = new student("nobi   notnobita","engneer","5806101234");
        s1.addSemester("58/1");
        s1.getsemester("50/1").addSubject("ENG 1","001101","001",3);
        s1.getsemester("50/1").getSubject("001101").setScore(90);
//        s1.getsemester("50/1").getSubject("001101").
        s1.printsemesterList();
        System.out.println(s1);
        s1.addSemester("58/2");
        s1.addSemester("58/2");
        s1.printsemesterList();

    }
}
