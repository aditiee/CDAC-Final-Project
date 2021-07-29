package com.project.Student_details.StudentsService;

import com.project.Student_details.dto.student_table;

import java.util.List;

public interface StudentService {


    public List<student_table> getAll(int s_class);
    public void addDetails(student_table st);

}
