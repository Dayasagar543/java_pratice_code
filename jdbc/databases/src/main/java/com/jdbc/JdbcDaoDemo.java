package com.jdbc;

import java.sql.*;

public class JdbcDaoDemo {
    public static void main(String[] args) {
        Student_Dao std_dao = new Student_Dao();
        Student s1 = std_dao.getstudent(11);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        std_dao.connect();
        Student s2=new Student();
        s2.setName("radhika");
        s2.setAge(25);
        std_dao.add_student(s2);
       

    }

}

class Student_Dao {
    Connection con=null;
    Student std = new Student();

    public void connect(){
        try {
            String url = "jdbc:mysql://localhost:3306/students";
            String user = "root";
            String password = "root";
            // Class.forName(com.mysql.jdbc.Driver);
            con = DriverManager.getConnection(url, user, password); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Student getstudent(int roll) {
        try {
            //the above code will make prepared statements to run not he
            std.setRoll_no(roll);
            Statement st =con.createStatement();
            String std_data = "select * from std_details where id =" + roll;
            ResultSet retrived_data = st.executeQuery(std_data);
            retrived_data.next();
            // String name = retrived_data.getString(1);
            // int age = retrived_data.getInt(2);
            String name = retrived_data.getString("name");
            int age = retrived_data.getInt("age");
            std.setName(name);
            std.setAge(age);
        } catch (Exception e) {
            System.out.println(e);
        }
        return std;
    }

    public void add_student(Student s){
        try {
            String query="insert std_details(name,age) values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, s.getName());
            pst.setInt(2, s.getAge());
            pst.executeUpdate();
        } catch (Exception e) {
          System.out.println(e);
        }
    }

}

class Student {
    private String name;
    private int roll_no;
    private int age = 0;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

}