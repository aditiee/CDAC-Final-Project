package com.project.Notice.Repository;

import com.project.Notice.dto.Notice_Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NoticeRepository extends JpaRepository<Notice_Table,Integer> {


    @Query(value="select * from Notice_table where date_to =?1 and student_class = null",nativeQuery = true)
    public List<Notice_Table> GlobalNotice(String ToDate);


    @Query(value="select * from Notice_table where student_class=?1 and date_to =?2",nativeQuery = true)
    public List<Notice_Table> ClassNotice(int student_class, String ToDate);


}
