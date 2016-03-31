package com.company;

public class Main {

    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        semester s1 = new semester("01/58");
        s1.addSubject("eng1","001101","001",3);
        s1.addSubject("eng2","001102","001",3);
        s1.addSubject("com pro","261101","002",3);
        s1.addSubject("Alternative","602102","003",2);
        System.out.println(s1.getTotalCredit());
        s1.getSubject("001102").setTeacher("Sarah");
        s1.getSubject("001101").setScore(80);
        s1.getSubject("261101").setScore(73);
        s1.getSubject("602102").setScore(73);
        s1.getSubject("001102").setScore(73);
        s1.printSubjects();
        System.out.println(s1.getSemGrade());
    }
}
