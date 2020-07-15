package blood.bank.management.system;

import java.lang.*;
import java.io.*;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DatabaseConnection {
    
    public static Connection dataBaseconnection()throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
        try
        {
     Connection connection = null;
     String databasename = "BloodDonation";
     String url="jdbc:mysql://localhost:3306/" + databasename;
     String username = "root";
     String password = "root1";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url, username, password);
        return connection;
}catch(Exception ex)
    {
        return null;
    }
    }
}
