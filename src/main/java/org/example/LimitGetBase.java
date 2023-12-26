package org.example;

import java.sql.*;
import java.util.Scanner;

public class LimitGetBase {
    private Connection connect() {
        String url = "jdbc:sqlite:sq.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectAll() {

        System.out.println("Введите лимит вывода до 11: ");
        int limit = new Scanner(System.in).nextInt();
        if (limit > 11 || limit < 1){
            limit = 5;
        }
        String sql = "SELECT * FROM Users LIMIT " + limit + ";";
        try (Connection conn = this.connect();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            System.out.println("employee_id " + "first_name " + " last_name");
            System.out.println("----------- " + "---------- " + " ---------");
            while (rs.next()) {
                System.out.println(rs.getInt("employee_id") +
                        "\t\t\t" + firstUpperCase(rs.getString("first_name")) +
                        "\t\t" + firstUpperCase(rs.getString("last_name")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private String firstUpperCase(String word) {
        if (word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}