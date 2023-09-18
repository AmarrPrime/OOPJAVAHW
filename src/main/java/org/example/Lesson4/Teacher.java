package org.example.Lesson4;

public class Teacher extends User{
    private int age;
    private int experience;
    private String subject;

    public Teacher(String name, int age, int experience, String subject) {
        super(name);
        this.age = age;
        this.experience = experience;
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", experience=" + experience +
                ", subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
