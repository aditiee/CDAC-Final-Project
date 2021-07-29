package com.project.Student_details.StudentsService;

import com.project.Student_details.dto.student_table;
import com.project.Student_details.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class StudentServiceimple implements StudentService {

    @Autowired
    StudentRepository sr;

    @Override
    public List<student_table> getAll(int s_class) {

            Iterable<student_table> s1;

            List<student_table> students;

            s1=sr.getStudentsByClass(s_class);

        Iterator<student_table> itr =s1.iterator();
        students=new ArrayList<student_table>();
        while(itr.hasNext()){
            students.add(itr.next()) ;
        }

        return  students;
    }

    @Override
    public void addDetails(student_table st) {
        sr.save(st);
    }
}
