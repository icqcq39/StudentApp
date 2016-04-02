package com.company;

import java.util.Scanner;

/**
 * Created by Admin Banana on 4/2/2016.
 */
public class func {
    static Scanner input = new Scanner(System.in);
    static String temp;

    public static void addNewSemester(student s){
        System.out.print("Enter new semester name : ");
        s.addSemester(input.nextLine());
    }
}
