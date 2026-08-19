package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {
    public void insert(Student s) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "insert into student(name,age,course) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getCourse());

            ps.executeUpdate();

            System.out.println("Student Added");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public void update(Student s) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "update student set name=?,age=?,course=? where id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getCourse());
            ps.setInt(4, s.getId());

            ps.executeUpdate();

            System.out.println("Updated Successfully");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public void display() {

        try {
            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from student");

            while(rs.next()) {

                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getString("course"));
                System.out.println("----------------");
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public void delete(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "delete from student where id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Deleted Successfully");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
