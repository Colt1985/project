package org.example;

import java.sql.*;

public class Select {
    private Connection connect() {
        String url = "jdbc:sqlite:sq.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }return conn;
    }

    public void selectAll() {
        String sql = "select employee_id,first_name,last_name from Users";
        try (Connection conn = this.connect();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            System.out.println("employee_id " + "first_name " + " last_name");
            System.out.println("----------- " + "---------- " + " ---------");
            while (rs.next()) {
                System.out.println(rs.getInt("employee_id") +
                        "\t\t\t" + firstUpperCase( rs.getString("first_name")) +
                        "\t\t" + firstUpperCase(rs.getString("last_name")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectFirstNameAndLastName() {
        String sql = "select employee_id,first_name,last_name from Users";
        try (Connection conn = this.connect();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            System.out.println("first_name " + " last_name");
            System.out.println( "---------- " + " ---------");
            while (rs.next()) {
                System.out.println(
                         firstUpperCase( rs.getString("first_name")) +
                        "\t\t" + firstUpperCase(rs.getString("last_name")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    void selectNameToUpperCase(){
        String sql = "select employee_id,first_name,last_name from Users";
        try (Connection conn = this.connect();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            System.out.println("employee_id " + "first_name " + " last_name");
            System.out.println("----------- " + "---------- " + " ---------");
            while (rs.next()) {
                System.out.println(rs.getInt("employee_id") +
                        "\t\t\t" + firstUpperCase( rs.getString("first_name").toUpperCase()) +
                        "\t\t" + firstUpperCase(rs.getString("last_name")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void selectFirstTrySymbolsName() {
        String sql = "select employee_id,first_name,last_name from Users";
        try (Connection conn = this.connect();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
            System.out.println("first_name");
            System.out.println("----------- ");
            while (rs.next()) {
                System.out.println(getFirstTrySymbols(firstUpperCase( rs.getString("first_name"))));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public String getFirstTrySymbols(String word){
        if(word == null || word.isEmpty()) return "";
        return word.substring(0, 3);
    }
    public String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}