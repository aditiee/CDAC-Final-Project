package com.project.Student_details.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student_table {

    @Id
    String user_id_student;
    int student_class;
    String gender;
    String DOB;
    String user_id_parent;

    public String getUser_id_student() {
        return user_id_student;
    }

    public void setUser_id_student(String user_id_student) {
        this.user_id_student = user_id_student;
    }

    public int getStudent_class() {
        return student_class;
    }

    public void setStudent_class(int student_class) {
        this.student_class = student_class;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getUser_id_parent() {
        return user_id_parent;
    }

    public void setUser_id_parent(String user_id_parent) {
        this.user_id_parent = user_id_parent;
    }
}
