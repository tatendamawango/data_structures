/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lw1_intro;

import models.Student;
import utils.*;

/**
 *
 * @author tatenda mawagno
 */
public class Main {

    public static void main(String[] args) {
        String filePath = "students_data.txt";

        Array<Student> students_arr = new Array<Student>();
        Array<Student> students_arr2 = new Array<Student>();
        Array<Student> students_arr3 = new Array<Student>();

        DataReader.readFromFile(filePath, students_arr);
        DataReader.readFromFile(filePath, students_arr2);
        DataReader.readFromFile(filePath, students_arr3);

        System.out.println("============Tests with array implementation============");
        //performTests(students_arr);

        LinkedList<Student> students_llist = new LinkedList<Student>();

// After implementing the LinkedList class and commenting out, we should get the following
// same results as for Class Array
        DataReader.readFromFile(filePath, students_llist);
//
//        System.out.println("============Tests with linked list implementation============");
//        performTests(students_llist);
//
//        performArrays(students_arr2);
//        performLinkedLists(students_arr3);
        students_arr.set(1, new Student("New", "Data", 01, "XX-YY"));
//        for(Student student : students_arr){
//            System.out.println(student);
//        }

        students_llist.set(2, new Student("New", "Data", 01, "XX-YY"));
        for(Student student : students_llist){
            System.out.println(student);
        }
    }

    private static void performTests(List<Student> students) {
        System.out.println("Initial students list:");

        for(Student student : students){
            System.out.println(student);
        }

        System.out.println(students.remove(new Student("Tomas", "Tomaitis", 22, "IF-7/1")));
        System.out.println(students.remove(new Student("Jonas", "Jonaitis", 19, "IFF-9/3")));
        System.out.println(students.remove(new Student("Vardenis", "Pavardenis", 99, "XX-XX")));

        System.out.println("\nAfter removal:");

        for(Student student : students){
            System.out.println(student);
        }

        students.add(new Student("Ona", "Onaite", 20,"IFF-8/1"));

        System.out.println("\nAfter addition at the end and insertion at the start:");

        for(Student student : students){
            System.out.println(student);
        }

        System.out.println("\nTesting get() method:");

        for(int i = 0; i < 2; i++){
            System.out.println(students.get(i));
        }

    }

    private static  void performArrays(List<Student> students) {
        ///////////////////Queue///////////////////////////////////////////////
        System.out.println("\nArray queue Implementation of methods:");
        System.out.println("-----------------------------------------------");
        ArrayQueue<Student> AQ_child = new ArrayQueue<Student>();
        for (Student student : students) {
            AQ_child.enqueue(student);
        }
        AQ_child.DisplayAll();
        System.out.println("\n");
        AQ_child.enqueue(new Student("Vardenis", "Pavardenis", 99, "XX-XX"));
        AQ_child.DisplayAll();
        System.out.println("\n");
        System.out.println(AQ_child.peek());
        System.out.println("\n");
        AQ_child.dequeue();
        AQ_child.DisplayAll();
        System.out.println("-----------------------------------------------");
        ////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////LinkListQueue implementation/////////////////////
        System.out.println("\nArray stack Implementation of methods:");
        System.out.println("-----------------------------------------------------------");
        ArrayStack<Student> AS_child = new ArrayStack<Student>();
        for (Student student : students) {
            AS_child.push(student);
        }
        AS_child.DisplayALl();
        System.out.println("\n");
        AS_child.push(new Student("Vardenis", "Pavardenis", 99, "XX-XX"));
        AS_child.DisplayALl();
        System.out.println(AS_child.pop());
        System.out.println("\n");
        System.out.println("-----------------------------------------------------------");
    }

    private static  void performLinkedLists(List<Student> students_arr3) {
        System.out.println("Linked lists Implementation of methods:");
        System.out.println("-------------------------------------------------------------------------------");
        LinkedListStack<Student> llstack = new LinkedListStack<Student>();

        for (Student student : students_arr3) {
            llstack.push(student);
        }

//        System.out.println(llstack.peek());
        llstack.DisplayAll();

        LinkedListQueue<Student> llqueue = new LinkedListQueue<Student>();

        for (Student student : students_arr3) {
            llqueue.enqueue(student);
        }

        System.out.println("-----------------queue-----------------------------");
        //System.out.println(llqueue.peek());
        llqueue.DisplayAll();
        System.out.println(llqueue.size());
        System.out.println("-------------------------------------------------------------------------------");
    }
    
}
