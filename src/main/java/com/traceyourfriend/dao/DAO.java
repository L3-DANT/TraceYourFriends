package com.traceyourfriend.dao;

import com.traceyourfriend.beans.User;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T>{

    int add(User user) throws SQLException;

    List<User> findAll() throws SQLException;

    User search(String email) throws SQLException;

    List<User> findFriends(User user) throws SQLException;

}
