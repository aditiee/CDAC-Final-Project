package com.project.UserData_Login.repository;

import com.project.UserData_Login.dto.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository <UserData , Integer > {

        @Query(value = "select * from user_data where email_id = ?1 and password = ?2",nativeQuery = true)
        public UserData loginE(String email , String password);

        @Query(value = "select * from user_data where mobile_no = ?1 and password = ?2",nativeQuery = true)
        public UserData loginM(String mobile, String password);




}
