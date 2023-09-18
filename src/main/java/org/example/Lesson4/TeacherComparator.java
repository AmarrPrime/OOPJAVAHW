package org.example.Lesson4;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
