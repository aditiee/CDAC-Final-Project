package com.project.Notice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Notice.dto.Notice_Table;
import com.project.Notice.Repository.NoticeRepository;



@Service
public class NoticeServiceImple implements NoticeService {
    @Autowired
    private NoticeRepository repository;

    public List<Notice_Table> GlobalNotice(String ToDate) {
        List<Notice_Table> list = new ArrayList<Notice_Table>();
        Iterable<Notice_Table> it ;
        it = repository.GlobalNotice(ToDate);
        Iterator<Notice_Table> itr = it.iterator();
        while(itr.hasNext())
        {
			Notice_Table t =(Notice_Table) itr.next();
            String s = itr.next().getDate_to();
			System.out.println(ToDate.charAt(ToDate.length()-1)+" " + s.charAt(s.length()-1) );
			if(ToDate.charAt(ToDate.length()-1) < s.charAt(s.length()-1))
			list.add(t);
            list.add(itr.next());
        }
        return list;
    }

    public List<Notice_Table> ClassNotice(int student_class,String ToDate) {
        List<Notice_Table> list = new ArrayList<Notice_Table>();
        Iterable<Notice_Table> it ;
        it = repository.ClassNotice(student_class, ToDate);
        Iterator<Notice_Table> itr = it.iterator();
        while(itr.hasNext())
        {
            Notice_Table t =(Notice_Table) itr.next();
            String s =t.getDate_to();
            System.out.println(ToDate.charAt(ToDate.length()-1)+" " + s.charAt(s.length()-1) );

            if(ToDate.charAt(ToDate.length()-1) < s.charAt(s.length()-1))
                list.add(t);
        }
        return list;
    }

    @Override
    public void addNotice(Notice_Table nt) {
        repository.save(nt);
    }
}