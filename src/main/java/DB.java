import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root123");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from librarian");
//            while(rs.next()) {
//                System.out.println(rs.getRow());
//            }
        }catch(Exception e){
//            System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }

}
