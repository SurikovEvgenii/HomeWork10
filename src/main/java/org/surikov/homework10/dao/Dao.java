package org.surikov.homework10.dao;

import org.surikov.homework10.entity.Studens;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Dao {

    public List getResult(){

        List<Studens> studensList = new ArrayList<>();

        try(Connection connection = DBManager.createConnection()) {
            String query = "SELECT * FROM students";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.getResultSet();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studensList;
    }

}
