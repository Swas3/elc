package power.supply.system;
import java.sql.*;
public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Swas@2002");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
