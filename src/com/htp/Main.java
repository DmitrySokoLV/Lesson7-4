package com.htp;

import java.util.Set;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {
        //4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать).
        //* Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного студента удалить из коллекции.

        Set<Student> studentSet = new TreeSet<>();

        Student student1 = new Student(1, "Dima");
        Student student2 = new Student(2, "Sasha");
        Student student3 = new Student(3, "Maxim");
        Student student4 = new Student(4, "Misha");
        Student student5 = new Student(5, "Slava");
        Student student6 = new Student(6, "Kristina");
        Student student7 = new Student(7, "john");


        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        studentSet.add(student6);
        studentSet.add(student7);

        if (studentSet.removeIf(student -> student.getId() % 2 != 0))

        for (Student i: studentSet) {
            System.out.println(i);
        }


    }
}
