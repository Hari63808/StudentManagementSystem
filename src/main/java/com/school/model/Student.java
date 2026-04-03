package com.school.model;

public class Student {

    private int id;
    private String name;
    private String email;
    private String course;
    private float gpa;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public float getGpa() { return gpa; }
    public void setGpa(float gpa) { this.gpa = gpa; }
}