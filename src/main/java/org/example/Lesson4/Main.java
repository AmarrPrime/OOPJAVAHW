//— Создать класс УчительКомпаратор по некоторому чиссловому параметру, типизировать его.
//— Создать класс УчительСервис и реализовать аналогично проделанному на семинаре для Студента,
// и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.
//— Создать класс УчительВью и реализовать аналогично проделанному на семинаре для Студентов;


package org.example.Lesson4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        teacherService.create("Teach1",16,66,"Math");
        teacherService.create("Teach2",33,73,"Chemistry");
        teacherService.create("Teach3",29,29,"Everything");
        teacherService.create("Teach4",77,33,"Gsom");

        List<Teacher> teachers = teacherService.getAll();
        teachers.sort(new TeacherComparator());
        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(teachers);

        System.out.println("");

        teacherService.modify("Teach3","prep3",13,14,"loathing");
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
