package com.project.UserData_Login.dto;


public class USerDataComplete {

    String fName_f;
    String lName_f;
    String lName;
    String address;
    String city;
    String state;
    String country;
    int role_id;
    String email_id_f;
    String mobile_no_f;

    String userId;
    String fName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName_f() {
        return fName_f;
    }

    public void setfName_f(String fName_f) {
        this.fName_f = fName_f;
    }

    public String getlName_f() {
        return lName_f;
    }

    public void setlName_f(String lName_f) {
        this.lName_f = lName_f;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getEmail_id_f() {
        return email_id_f;
    }

    public void setEmail_id_f(String email_id_f) {
        this.email_id_f = email_id_f;
    }

    public String getMobile_no_f() {
        return mobile_no_f;
    }

    public void setMobile_no_f(String mobile_no_f) {
        this.mobile_no_f = mobile_no_f;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public String getDisApprovalR() {
        return disApprovalR;
    }

    public void setDisApprovalR(String disApprovalR) {
        this.disApprovalR = disApprovalR;
    }

  



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;
    String email_id;
    String mobile_no;
    boolean isActive;
    boolean isApproved;
    String disApprovalR;

}
