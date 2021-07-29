package com.project.UserData_Login.controller;

import com.project.UserData_Login.dto.USerDataComplete;
import com.project.UserData_Login.dto.UserData;
import com.project.UserData_Login.userService.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class userController {

    @Autowired
    private userService UserService;


    @PostMapping(value = "user_reg")
    public void userReg(@RequestBody USerDataComplete udc) {
        System.out.println("i m here");
        UserData ud1 = new UserData();
        UserData ud2 = new UserData();
        ud1.setfName(udc.getfName());
        ud1.setlName(udc.getlName());
        ud1.setAddress(udc.getAddress());
        ud1.setCity(udc.getCity());
        ud1.setEmail_id(udc.getEmail_id());
        ud1.setMobile_no(udc.getMobile_no());
        ud1.setRole_id(udc.getRole_id());
        ud1.setState(udc.getState());
        ud1.setCountry(udc.getCountry());
        String id = String.valueOf(udc.getRole_id());
        ud1.setUserId(id+udc.getMobile_no());
        ud1.setPassword(udc.getPassword());
        ud2.setfName(udc.getfName_f());
        ud2.setlName(udc.getlName_f());
        ud2.setAddress(udc.getAddress());
        ud2.setCity(udc.getCity());
        ud2.setEmail_id(udc.getEmail_id_f());
        ud2.setMobile_no(udc.getMobile_no_f());
        ud2.setRole_id(udc.getRole_id()+1);
        ud2.setState(udc.getState());
        ud2.setCountry(udc.getCountry());
        ud2.setPassword(udc.getMobile_no_f());
        int userIdf=0;
        if(udc.getRole_id()==2) {
                userIdf=3;
        }
        String s1 = String.valueOf(userIdf);
        ud2.setUserId(userIdf+udc.getMobile_no_f());
        UserService.addUser(ud1);



        if (ud2.getfName() == null) {

        } else {
            UserService.addUser(ud2);
        }
    }

    @GetMapping(value = "")
    public void disp(){
        System.out.println("hello");

    }

    @PostMapping(value = "login")
    public UserData login(@RequestBody UserData userdata){

        System.out.println(userdata);
        userdata=UserService.UserLogin(userdata);

        System.out.println(userdata);
        return  userdata;
    }

    @PostMapping(value="approval")
    public void approved(@RequestBody List<UserData> ud){
        UserService.aprove(ud);
    }


    @GetMapping(value="userList")
    public List<UserData> uList(){
        return UserService.getAll();
    }




}
