package ru.javavision.service;

import ru.javavision.dao.UserDao;
import ru.javavision.model.User;

import java.sql.SQLException;


/**
 * Created by Михаил on 28.05.2019.
 */
public class UserService {
    private UserDao userDao;

    public UserService() {
        try {
            userDao = new UserDao();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void userRegistration(User user){userDao.userRegistration(user);}

    public User findARegisteredUser(String login, String password) {return userDao.findARegisteredUser(login, password);}

    public User loginUser(String login, String password) { userDao.deleteUser(login, password);
        return null;
    }

    public void addUser(User user){userDao.addUser(user);}



}
