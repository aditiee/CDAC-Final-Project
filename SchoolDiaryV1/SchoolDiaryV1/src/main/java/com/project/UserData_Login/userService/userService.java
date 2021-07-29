package com.project.UserData_Login.userService;

import com.project.UserData_Login.dto.UserData;

import java.util.List;

public interface userService {

    public void addUser(UserData user);
    public void removeUser(int id);
    public UserData getUser(int id);
    public void modifyUser(UserData user);
    public List<UserData> getAll();
    public UserData UserLogin(UserData user);
    public void aprove(List<UserData> ud);


}
