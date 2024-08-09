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

        // we need to understand DAO(Data Access Object) pattern so that i would be easy
        // for us to handle database related things easily so that if there is any
        // problem we can solve them.

        // credentials required for the database
        // String url = "jdbc:mysql://localhost:3306/world";
        String url = "jdbc:mysql://localhost:3306/students";
        String user_name = "root";
        String pass = "root";

        // query

        // String query = " select district from city where name='hyderabad'";
        // String query = "select * from city";
        // String query = "insert into std_details(name,age) values('rahul',23)";
        // query ------if you have the variables incoming from the front end
        String name = "arun";
        int age = 13;
        String query = "insert into std_details(name,age) values('" + name + "'," + age + ")";
        String query1 = "insert into std_details(name,age) values(?,?)";// if we are using the p

        // Class.forName(com.mysql.jdbc.Driver);<-------this line works in other ides as
        // there its mandatory

        // but for vs code it manages everything as we add the depencecies in pom file
        Connection con = DriverManager.getConnection(url, user_name, pass);
        Statement st = con.createStatement();// for simple data we can use this statement but more more data and colums
                                             // we cannot manually use this
        PreparedStatement st1 = con.prepareStatement(query1);// this is used for more paramters table where you donot
                                                             // need to spcify everything.
        st1.setString(1, name);
        st1.setInt(2, age);
        // ResultSet rs = st.executeQuery(query);//DQL as we are getting the data by
        // querying
        int count = st.executeUpdate(query);
        System.out.println(count + "rows affected");

        int count1 = st1.executeUpdate();
        System.out.println(count1 + "rows affected");

        // below code is to query the data from the database

        // rs.next();
        // // String name = rs.getString("district");
        // String user_data = rs.getInt(1) + ":" + rs.getString(2);
        // System.out.println(user_data);
        // while (rs.next()) {
        // String user_data1 = rs.getInt(1) + ":" + rs.getString(2);
        // // uncomment below to get more columns information
        // // + " countrycode: " + rs.getString(3)
        // // + " district: " + rs.getString(4);
        // System.out.println(user_data1);

        // }

        // the commented lines below is how we can get the data from the database using
        // the indexs of columns manually
        // rs.next();
        // String name = rs.getString("district");
        // System.out.println(name);
        // String user_data1=rs.getInt(1)+":"+rs.getString(2) +" countrycode:
        // "+rs.getString(3) +" district: " +rs.getString(4);
        // System.out.println(user_data1);
        // rs.next();
        // String user_data2=rs.getInt(1)+":"+rs.getString(2) +" countrycode:
        // "+rs.getString(3) +" district: " +rs.getString(4);
        // System.out.println(user_data2);
        // rs.next();
        // String user_data3=rs.getInt(1)+":"+rs.getString(2) +" countrycode:
        // "+rs.getString(3) +" district: " +rs.getString(4);
        // System.out.println(user_data3);

        st.close();
        con.close();

    }
}
