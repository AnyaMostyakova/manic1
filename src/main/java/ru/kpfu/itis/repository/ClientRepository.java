package ru.kpfu.itis.repository;

import ru.kpfu.itis.model.Client;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ClientRepository {
    public List<Client> findAll() {
        try {
            Connection connection = DBConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(
                    "select id, email, password from client"
            );

            ResultSet resultSet = statement.executeQuery();

            List<Client> result = new ArrayList<>();

            while (resultSet.next()) {
                result.add(new Client(
                        resultSet.getLong("id"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                ));
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Client findById(Long id) {
        try {
            Connection connection = DBConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(
                    "select id, email, password from client where id = ? "
            );

            statement.setLong(1, id);

            ResultSet resultSet = statement.executeQuery();

            Client result = null;

            if (resultSet.next()) {
                result = new Client(
                        resultSet.getLong("id"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Client findByUserName(String email) {
        try {
            Connection connection = DBConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(
                    "select id, email, password from client where email = ? "
            );

            statement.setString(1, email);

            ResultSet resultSet = statement.executeQuery();

            Client result = null;

            if (resultSet.next()) {
                result = new Client(
                        resultSet.getLong("id"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
            }

            resultSet.close();
            statement.close();

            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Client save(Client client) {
        try {
            Connection connection = DBConnection.getConnection();

            PreparedStatement statement = connection.prepareStatement(
                    "insert into client (email,password) " +
                            "values ( ? , ?  ) returning id "
            );

            statement.setString(1, client.getEmail());
            statement.setString(2, client.getPassword());

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                client.setId(resultSet.getLong("id"));
            }

            resultSet.close();
            statement.close();

            return client;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}