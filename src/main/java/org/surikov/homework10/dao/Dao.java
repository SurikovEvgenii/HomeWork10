package org.surikov.homework10.dao;

import org.surikov.homework10.entity.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    public static List<Students> select(){

        String query = "SELECT DISTINCT(evaluation), students.firstname, students.lastname FROM students ORDER BY evaluation DESC";
        ResultSet resultSet;
        List<Students> studentsList = new ArrayList<>();

        try(Connection connection = DBManager.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            resultSet = preparedStatement.executeQuery();

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
    }

}
