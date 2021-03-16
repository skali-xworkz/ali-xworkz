package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.UserDTO;

public interface UserDao {
public void addUserDetails(UserDTO dto)throws RuntimeException;
}
