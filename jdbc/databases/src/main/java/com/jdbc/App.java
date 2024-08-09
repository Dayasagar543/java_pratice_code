package com.jdbc;

import java.sql.*;//importing the sql 
// com.mysql.jdbc.Driver <------------download the jdbc driver for the realted database like oracle /mysql/mongo/progressql etc and import it
// create connection ---------> create obj of Connection interface
// create a statement  ---------> create obj of Statement interface
// execute the query
// process the results
// close

public class App {
    public static void main(String[] args) throws Exception {
        // credentials required for the database
        String url = "jdbc:mysql://localhost:3306/world";
        String user_name = "root";
        String pass = "root";

        // query
        String query = " select district from city where name='hyderabad'";
        
        // Class.forName() <-------this line works in other ides as there its mandatory
        // but for vs code it manages everything as we add the depencecies in pom file
        Connection con = DriverManager.getConnection(url, user_name, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("district");
        System.out.println(name);
        st.close();
        con.close();

    }
}
