package com.imac.user;
import java.util.List;

public interface UserDAO 
{
    public void addUser(UserEntity user);
    public List<UserEntity> getAllUsers();
    public void deleteUser(Integer userId);
}