package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        home();
    }

    public static void test01(){
        student s1 = new student("nobi   notnobita","engneer","580610123");
        s1.addSemester("58/1");
        s1.getsemester("50/1").addSubject("ENG 1","001101","001",3);
        s1.getsemester("50/1").getSubject("001101").setScore(90);
        s1.printsemesterList();
        System.out.println(s1);
        s1.addSemester("58/2");
        s1.addSemester("58/2");
        s1.printsemesterList();

    }

    public static void home(){
        String name,code,faculty;
        Scanner in = new Scanner(System.in);
        System.out.print("Hello \n Please enter your name : ");
        name = in.nextLine();
        System.out.print("Enter your student code : ");
        code = in.nextLine();
        System.out.print("Enter your faculty : ");
        faculty = in.nextLine();
        student st1 = new student(name,faculty,code);

        func.addNewSemester(st1);
        st1.printsemesterList();
    }
}
