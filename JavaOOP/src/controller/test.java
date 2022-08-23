package controller;

import Model.Student;

public class test {

    public static void main(String[] args)
    {
        Student student = new Student("travis", 25, "male", 200168);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("ID Number: " + student.getIdNumber());
    }


}
