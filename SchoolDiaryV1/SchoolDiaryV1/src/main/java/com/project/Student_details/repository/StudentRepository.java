package com.project.Student_details.repository;

import com.project.Student_details.dto.student_table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<student_table, Integer> {

        @Query(value ="select * from student_table where student_class =?1",nativeQuery = true)
        public List<student_table> getStudentsByClass(int s_class);

}
