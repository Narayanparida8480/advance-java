import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url = "JDBC:mysql://localhost:3306/collage";
        String username = "root";
        String password = "Narayan@8480395391";
        try { 
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully!");
            String sql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 3);
            ps.setString(2, "Rahu");
            ps.setInt(3, 23);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Record inserted successfully.");
            } else {
                System.out.println("Record not inserted.");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



