/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 *
 * @author jaismansinghsidhu
 */
public class StudentList {
    public static void main(String[] args){
        Student s1 = new Student(1, "Jaisman","18 copeland rd");
        Student[] StudentList = new Student[3];
        StudentList[0]=s1;
        System.out.println("Third Comment");
        StudentList[1] = new Student(2, "K","O");
        StudentList[2]  = new Student(3, "O","jssjj");
        
        for (int i=0; i<StudentList.length;i++){
            System.out.println(StudentList[i].getName());
        }

        
    }
}
