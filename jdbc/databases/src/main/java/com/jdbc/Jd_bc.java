package com.jdbc;

import java.rmi.server.ExportException;
import java.sql.*;

public class Jd_bc {
    public static void main(String[] args) throws ExportException {

        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String pass = "root";
        String query = "select * from std_details";
        Connection con;
        try {
            con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(query);
            while (result.next()) {
                String user_data1 = result.getInt(1) + ":" + result.getString(2);
                // uncomment below to get more columns information
                // + " countrycode: " + result.getString(3)
                // + " district: " + result.getString(4);
                System.out.println(user_data1);
        
                }
        } catch (SQLException e) {
           
            e.printStackTrace();
        }

    }

}
