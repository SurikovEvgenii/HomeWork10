package org.surikov.homework10.service;

import org.surikov.homework10.dao.Dao;
import org.surikov.homework10.entity.Students;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    static List<Students> studentsList;

    public StudentService() {
        studentsList = new ArrayList<>();
    }
    /*
    public static List<Students> getStudent(){

        try {

            ResultSet resultSet

            while(resultSet.next()){
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                int evaluation = resultSet.getInt(1);
                studentsList.add(new Students(firstName,lastName,evaluation));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return studentsList;

    }*/

}
