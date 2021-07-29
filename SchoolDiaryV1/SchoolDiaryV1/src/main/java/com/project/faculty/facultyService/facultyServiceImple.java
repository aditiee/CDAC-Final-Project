package com.project.faculty.facultyService;

import com.project.faculty.dto.faculty;
import com.project.faculty.repository.facultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class facultyServiceImple implements  facultyService{


    @Autowired
    facultyRepository fr;


    @Override
    public faculty getClass(String id) {

    return fr.fetchClass(id);

    }
}
