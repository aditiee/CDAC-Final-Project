package com.project.Notice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.Notice.dto.Notice_Table;
import com.project.Notice.service.NoticeService;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
@CrossOrigin (origins="*",allowedHeaders="*")
public class NoticeController {

    @Autowired
    private NoticeService ns;

    @PostMapping(value = "school_notice")
    public List<Notice_Table> GNotice(@RequestBody Notice_Table notice) {
        System.out.println(notice.getStudent_class() + " " + notice.getDate_to()+ " " + notice.getNotice_id());
        System.out.println(notice);
        return ns.GlobalNotice(notice.getDate_to());
    }

    @PostMapping(value = "class_notice")
    public List<Notice_Table> CNotice(@RequestBody Notice_Table notice) {
        System.out.println(notice.getStudent_class() + " " + notice.getDate_to()+ " " + notice.getNotice_id());
        System.out.println(notice);
        return ns.ClassNotice(notice.getStudent_class(),notice.getDate_to());
    }

    @PostMapping(value = "schoolnotice")
    public void snotice(@RequestBody  Notice_Table nt){
        System.out.println(nt);
        ns.addNotice(nt);
    }


}