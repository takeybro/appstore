package com.sr.store.entery.entity;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.Serializable;
@Component
public class user extends enter implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private Integer gender;
    private String avatar;
    private Integer isDelete;
    public String getUsername(){
        return  username;
    }
    public String getSalt(){
        return salt;
    }
    public String getEmail(){
        return email;
    }
    public Integer getGender(){
        return gender;
    }
    public Integer getIsDelete() {
        return isDelete;
    }
    public String getAvatar() {
        return avatar;
    }
    public Integer getUid() {
        return uid;
    }
    public String getPassword() {
        return password;
    }
    public String getPhone() {
        return phone;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof user)) return false;
        if (!super.equals(o)) return false;
        user user = (user) o;
        if (getUid() != null ? !getUid().equals(user.getUid()) : user.getUid() != null) return false;
        if (getUsername() != null ? !getUsername().equals(user.getUsername()) : user.getUsername() != null)
            return false;
        if (getPassword() != null ? !getPassword().equals(user.getPassword()) : user.getPassword() != null)
            return false;
        if (getSalt() != null ? !getSalt().equals(user.getSalt()) : user.getSalt() != null) return false;
        if (getPhone() != null ? !getPhone().equals(user.getPhone()) : user.getPhone() != null) return false;
        if (getEmail() != null ? !getEmail().equals(user.getEmail()) : user.getEmail() != null) return false;
        if (getGender() != null ? !getGender().equals(user.getGender()) : user.getGender() != null) return false;
        if (getAvatar() != null ? !getAvatar().equals(user.getAvatar()) : user.getAvatar() != null) return false;
        return getIsDelete() != null ? getIsDelete().equals(user.getIsDelete()) : user.getIsDelete() == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getUid() != null ? getUid().hashCode() : 0);
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getSalt() != null ? getSalt().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + (getAvatar() != null ? getAvatar().hashCode() : 0);
        result = 31 * result + (getIsDelete() != null ? getIsDelete().hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "user{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", avatar='" + avatar + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
