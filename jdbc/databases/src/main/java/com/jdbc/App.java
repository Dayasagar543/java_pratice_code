package com.jdbc;

import java.sql.*;//importing the sql 
// com.mysql.jdbc.Driver <------------download the jdbc driver for the realted database like oracle /mysql/mongo/progressql etc and import it
// create connection ---------> create obj of Connection interface
// create a statement  ---------> create obj of Statement interface
// execute the query
// process the results
// close
public class App 
{
    public static void main( String[] args ) throws Exception
    {
       String url="jdbc:mysql://localhost:3306/world" ;
       String user_name="root" ;
       String pass="root" ;
       String query=" select * from city where name = kabul";

       Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection(url, user_name, pass);
       Statement st = con.createStatement();
       ResultSet rs=st.executeQuery(query);

       
    }
}
