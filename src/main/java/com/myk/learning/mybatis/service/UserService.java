package com.myk.learning.mybatis.service;

import com.myk.learning.mybatis.model.User;

import java.util.List;

/**
 * The interface User service.
 * <p/>
 * Created in 2018.11.09
 * <p/>
 *
 * @author myk
 */
public interface UserService {
    /**
     * Select all list.
     *
     * @return the list
     */
    List<User> selectAll();

    /**
     * Insert user boolean.
     *
     * @param user the user
     * @return the boolean
     */
    Boolean insertUser(User user);
}
