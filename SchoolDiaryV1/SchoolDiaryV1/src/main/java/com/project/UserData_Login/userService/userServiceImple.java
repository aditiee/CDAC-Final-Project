package com.project.UserData_Login.userService;

import com.project.UserData_Login.dto.UserData;
import com.project.UserData_Login.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userServiceImple implements  userService{

    @Autowired
    userRepository ur;


    @Override
    public void addUser(UserData user) {
    ur.save(user);
    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public UserData getUser(int id) {
        return null;
    }

    @Override
    public void modifyUser(UserData user) {

    }

    @Override
    public List<UserData> getAll() {

       return ur.findAll();
    }

    @Override
    public UserData UserLogin(UserData user){
        if(user.getEmail_id()!=null) {
        user=ur.loginE(user.getEmail_id(), user.getPassword());
        return user;
    }else if(user.getMobile_no()!=null){
        user=ur.loginM(user.getMobile_no(),user.getPassword());
        return user;
        }


        return null;
    }

    @Override
    public void aprove(List<UserData> ud) {
        ur.saveAll(ud);
    }
}
